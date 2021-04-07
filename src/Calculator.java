import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator extends JFrame {
    JTextArea display;  //I used JTextArea because they can be appended unlike JTextFields
    JButton[] numbers;
    JButton add,diff,mult,div, equal, del;
    
     //Calculation Variables
        String strNum1 = "";
        String strNum2 = "";
        String[] statement;
        int num1 = 0;
        int num2 = 0;        
        String strTotal = "";
        int totalVal = 0;
        double numDiv1 = 0;
        double numDiv2 = 0;
        double divRes = 0;
    
       
    public Calculator(){
        //set up display panel
        JPanel p1 = new JPanel(new GridLayout());
        display = new JTextArea();       
        display.setEditable(false);
        p1.add(display);
        
        
        //set up button panel
        JPanel p2 = new JPanel(new GridBagLayout());
        
        GridBagConstraints c = new GridBagConstraints();
        
        c.insets = new Insets(4,4,4,4);
        
        numbers = new JButton[10];
        numbers[1] = new JButton("1");
        c.gridx = 1;
        c.gridy = 0;
        p2.add(numbers[1], c);
        numbers[1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent num){
                display.append("1");
            }
        });
        
        numbers[2] = new JButton("2");
        c.gridx = 2;
        c.gridy = 0;
        p2.add(numbers[2], c);
        numbers[2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent num){
                display.append("2");
            }
        });
        
        
        numbers[3] = new JButton("3");
        c.gridx = 3;
        c.gridy = 0;
        p2.add(numbers[3], c);  
        numbers[3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent num){
                display.append("3");
            }
        });
        
        
        numbers[4] = new JButton("4");
        c.gridx = 1;
        c.gridy = 1;
        p2.add(numbers[4], c);
        numbers[4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent num){
                display.append("4");
            }
        });
        
        
        numbers[5] = new JButton("5");
        c.gridx = 2;
        c.gridy = 1;
        p2.add(numbers[5], c);
        numbers[5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent num){
                display.append("5");
            }
        });
        
        
        numbers[6] = new JButton("6");
        c.gridx = 3;
        c.gridy = 1;
        p2.add(numbers[6], c);   
        numbers[6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent num){
                display.append("6");
            }
        });
        
        
        numbers[7] = new JButton("7");
        c.gridx = 1;
        c.gridy = 2;
        p2.add(numbers[7],c);
        numbers[7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent num){
                display.append("7");
            }
        });
        
        
        numbers[8] = new JButton("8");
        c.gridx = 2;
        c.gridy = 2;
        p2.add(numbers[8], c);
        numbers[8].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent num){
            display.append("8");
        }
    });
        
        
        numbers[9] = new JButton("9");
        c.gridx = 3;
        c.gridy = 2;
        p2.add(numbers[9], c);
        numbers[9].addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent num){
               display.append("9");
           } 
        });
                
        
        numbers[0] = new JButton("0");
        c.gridx = 2;
        c.gridy = 3;
        p2.add(numbers[0], c);
        numbers[0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent num){
                display.append("0");
            }
        });
               //we can also use for loops for the above statements
        
        //operations buttons
        add = new JButton("+");
        c.gridx = 4;
        c.gridy = 0;
        p2.add(add, c);
        add.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent num){
               display.append("+");
           } 
        });
        
        diff = new JButton("-");
        c.gridx = 4;
        c.gridy = 1;
        p2.add(diff, c);
        diff.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent num){
               display.append("-");
           } 
        });
        
        div = new JButton("÷");
        c.gridx = 4;
        c.gridy = 2;
        p2.add(div, c);
        div.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent num){
               display.append("÷");
           } 
        });
        
        mult = new JButton("x");
        c.gridx = 4;
        c.gridy = 3;
        p2.add(mult, c);
        mult.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent num){
               display.append("*");
           } 
        });
        
              
        equal = new JButton("=");
        c.gridx = 3;
        c.gridy = 3; 
        p2.add(equal, c);
         equal.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent num){
               if(display.getText().contains("+")){
                   statement = display.getText().split("\\+");
                   
                   strNum1 = statement[0];
                   strNum2 = statement[1];
                   
                   num1 = Integer.parseInt(strNum1);
                   num2 = Integer.parseInt(strNum2);
                   
                   totalVal = num1 + num2;
                   
                   strTotal = Integer.toString(totalVal);
                   
                   display.setText(strTotal);
                   
               }else if(display.getText().contains("-")){
                   statement = display.getText().split("\\-");
                   
                   strNum1 = statement[0];
                   strNum2 = statement[1];
                   
                   num1 = Integer.parseInt(strNum1);
                   num2 = Integer.parseInt(strNum2);
                   
                   totalVal = num1 - num2;
                   
                   strTotal = Integer.toString(totalVal);
                   
                   display.setText(strTotal);
               }else if(display.getText().contains("÷")){
                   statement = display.getText().split("\\÷");
                   
                   strNum1 = statement[0];
                   strNum2 = statement[1];
                   
                   numDiv1 = Double.parseDouble(strNum1);
                   numDiv2 = Double.parseDouble(strNum2);
                   
                   divRes = numDiv1 / numDiv2;
                   
                   strTotal = Double.toString(divRes);
                   
                   display.setText(strTotal);
                   
                   
               }else if(display.getText().contains("*")){
                   statement = display.getText().split("\\*");
                   
                   strNum1 = statement[0];
                   strNum2 = statement[1];
                   
                   num1 = Integer.parseInt(strNum1);
                   num2 = Integer.parseInt(strNum2);
                   
                   totalVal = num1 * num2;
                   
                   strTotal = Integer.toString(totalVal);
                   
                   display.setText(strTotal);
                   
                   
               }  
           } 
        });
        
        
        del = new JButton("clr");
        c.gridx = 1;
        c.gridy = 3;
        p2.add(del, c);
        del.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                display.setText(null);
            }
        });
        
           
       
        
    add(p1, BorderLayout.NORTH);
    add(p2, BorderLayout.CENTER);       
        
        
    addWindowListener(new WindowAdapter(){
       public void windowClosing(WindowEvent e){
           dispose();
       } 
    });    
    setTitle("CALCULATOR");
    setSize(270,210);   
    setLocationRelativeTo(null);
    setVisible(true);
    }
    
    public static void main(String[] args){
       new Calculator();
    }
    
    
    
}
