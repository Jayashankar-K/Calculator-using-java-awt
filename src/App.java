import java.awt.*;  
import java.awt.event.*;  
class MyCalc extends WindowAdapter implements ActionListener{
Frame f;
Label   l1,l2;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
Button badd,bsub,bmult,bdiv,bmod,bcalc,bclr,bpts,bneg,bback;
Button bpow,broot,bsin,bcos,btan,bcosec,bsec,bcot,bfac;
Button blog,bln,bex,bpi,bin,bten;
double xd;
double num1,num2,check;

MyCalc(){  
  f= new Frame("MY CALCULATOR");
// INSTANTIATING COMPONENETS
l1=new Label();
l1.setBackground(Color.LIGHT_GRAY);
l1.setBounds(50,65,260,60);

l2=new Label("SCIENTIFIC CALCULATOR");
l2.setBounds(105,25,150,40);

b1=new Button("1");
  b1.setBounds(50,340,50,50);
b2=new Button("2");
  b2.setBounds(100,340,50,50);
b3=new Button("3");
  b3.setBounds(150,340,50,50);
bsub=new Button("-");
  bsub.setBounds(210,340,50,50);
broot=new Button("\u221A");
  broot.setBounds(260,340,50,50);


b4=new Button("4");
  b4.setBounds(50,290,50,50);
b5=new Button("5");
  b5.setBounds(100,290,50,50);
b6=new Button("6");
  b6.setBounds(150,290,50,50);
bmult=new Button("*");
  bmult.setBounds(210,290,50,50);
bfac=new Button("!");
  bfac.setBounds(260,290,50,50);


b7=new Button("7");
  b7.setBounds(50,240,50,50);
b8=new Button("8");
  b8.setBounds(100,240,50,50);
b9=new Button("9");
  b9.setBounds(150,240,50,50);
bdiv=new Button("/");
  bdiv.setBounds(210,240,50,50);
bmod=new Button("%");
  bmod.setBounds(260,240,50,50);


bneg=new Button("+/-");
  bneg.setBounds(50,390,50,50);
b0=new Button("0");
  b0.setBounds(100,390,50,50);
bpts=new Button(".");
  bpts.setBounds(150,390,50,50);
badd=new Button("+");
  badd.setBounds(210,390,50,50);
bpow=new Button("^");
  bpow.setBounds(260,390,50,50);


bcalc=new Button("=");
  bcalc.setBounds(50,500,260,50);


bback=new Button("DEL");
 bback.setBounds(180,450,130,50);
bclr=new Button("CLEAR");
  bclr.setBounds(50,450,130,50);


bsin=new Button("sin");
  bsin.setBounds(50,130,43,50);
bcos=new Button("cos");
  bcos.setBounds(93,130,43,50);
btan=new Button("tan");
  btan.setBounds(136,130,43,50);
bcosec=new Button("cosec");
  bcosec.setBounds(179,130,43,50);
bsec=new Button("sec");
  bsec.setBounds(222,130,44,50);
bcot=new Button("cot");
  bcot.setBounds(265,130,44,50);


blog=new Button("log()");
  blog.setBounds(50,180,43,50);
bln=new Button("ln()");
  bln.setBounds(93,180,43,50);
bex=new Button("e^x");
  bex.setBounds(136,180,43,50);
bpi=new Button("\u03C0");
  bpi.setBounds(179,180,43,50);
bin=new Button("1/x");
  bin.setBounds(222,180,44,50);
bten=new Button("*10^x");
  bten.setBounds(265,180,44,50);



b1.addActionListener(this);
b2.addActionListener(this);  
b3.addActionListener(this);  
b4.addActionListener(this);  
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);  
b0.addActionListener(this);

bpts.addActionListener(this);  
bneg.addActionListener(this);
bback.addActionListener(this);

badd.addActionListener(this);
bsub.addActionListener(this);
bmult.addActionListener(this);
bdiv.addActionListener(this);
bmod.addActionListener(this);
bcalc.addActionListener(this);
bclr.addActionListener(this);

bpow.addActionListener(this);
broot.addActionListener(this);
bfac.addActionListener(this);

bsin.addActionListener(this);
bcos.addActionListener(this);
bcosec.addActionListener(this);
bsec.addActionListener(this);
btan.addActionListener(this);
bcot.addActionListener(this);

blog.addActionListener(this);
bln.addActionListener(this);
bex.addActionListener(this);
bpi.addActionListener(this);
bin.addActionListener(this);
bten.addActionListener(this);

f.addWindowListener(this);
//ADDING TO FRAME  
f.add(l1);f.add(l2);
f.add(b1); f.add(b2); f.add(b3); f.add(b4); f.add(b5);f.add(b6); f.add(b7); f.add(b8);f.add(b9);f.add(b0);

f.add(badd); f.add(bsub); f.add(bmod); f.add(bmult); f.add(bdiv); f.add(bmod);f.add(bcalc);f.add(bpow);

f.add(bclr); f.add(bpts);f.add(bneg); f.add(bback);f.add(broot);f.add(bsin);f.add(bcos);f.add(bfac);

f.add(btan);f.add(bcosec);f.add(bsec);f.add(bcot);f.add(blog);f.add(bln);
f.add(bex);f.add(bpi);f.add(bin);f.add(bten);


f.setSize(360,580);  
f.setLayout(null);  
f.setVisible(true);  


}
                     
public void windowClosing(WindowEvent e) {          //FOR CLOSING THE WINDOW
  f.dispose();
}

public void actionPerformed(ActionEvent e){               //NUMBER BUTTON
  String z,zt;
                       
if(e.getSource()==b1){
 zt=l1.getText();
  z=zt+"1";
  l1.setText(z);
}
if(e.getSource()==b2){
zt=l1.getText();
z=zt+"2";
l1.setText(z);
}
if(e.getSource()==b3){
  zt=l1.getText();
  z=zt+"3";
  l1.setText(z);
}
if(e.getSource()==b4){
  zt=l1.getText();
  z=zt+"4";
  l1.setText(z);
}
if(e.getSource()==b5){
  zt=l1.getText();
  z=zt+"5";
  l1.setText(z);
}
if(e.getSource()==b6){
  zt=l1.getText();
  z=zt+"6";
  l1.setText(z);
}
if(e.getSource()==b7){
  zt=l1.getText();
  z=zt+"7";
  l1.setText(z);
}
if(e.getSource()==b8){
  zt=l1.getText();
  z=zt+"8";
  l1.setText(z);
}
if(e.getSource()==b9){
  zt=l1.getText();
  z=zt+"9";
  l1.setText(z);
}
if(e.getSource()==b0){
  zt=l1.getText();
  z=zt+"0";
  l1.setText(z);
}

if(e.getSource()==bpts){  //ADD DECIMAL PTS
  zt=l1.getText();
  z=zt+".";
  l1.setText(z);
}
if(e.getSource()==bneg){ //FOR NEGATIVE
  zt=l1.getText();
  z="-"+zt;
  l1.setText(z);
}

if(e.getSource()==bback){  // FOR  BACKSPACE
  zt=l1.getText();
  try{
    z=zt.substring(0, zt.length()-1);
    }catch(StringIndexOutOfBoundsException f){return;}
  l1.setText(z);
}
                
if(e.getSource()==badd){                     //FOR ADDITION
  try{
    num1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="";
  l1.setText(z);
  check=1;
}
if(e.getSource()==bsub){                    //FOR SUBTRACTION
  try{
    num1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="";
  l1.setText(z);
  check=2;
}
if(e.getSource()==bmult){                   //FOR MULTIPLICATION
  try{
    num1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="";
  l1.setText(z);
  check=3;
}
if(e.getSource()==bdiv){                   //FOR DIVISION
  try{
    num1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="";
  l1.setText(z);
  check=4;
}
if(e.getSource()==bmod){                  //FOR MOD/REMAINDER
  try{
    num1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="";
  l1.setText(z);
  check=5;
}
if(e.getSource()==bpow){                  //FOR POWER
  try{
    num1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="";
  l1.setText(z);
  check=6;
}

if(e.getSource()==broot){                  //FOR SQUARE ROOT
  try{
    num1=Double.parseDouble(l1.getText());
    xd =Math.sqrt(num1);
  }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
}


if(e.getSource()==bfac){                  //FOR FACTORIAL
  try{
    num1=Double.parseDouble(l1.getText());
    int i=1,fact=1;
    for(i=1;i<=num1;i++){
      fact=fact*i;
    }
  xd=fact;
  }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
}

if(e.getSource()==bsin){                  //FOR SINE
  try{
    num1=Double.parseDouble(l1.getText());  
  double b = Math.toRadians(num1);          
  xd =Math.sin(b);
  }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
}

if(e.getSource()==bcos){                  //FOR COSINE
  try{ 
    num1=Double.parseDouble(l1.getText());
    double b = Math.toRadians(num1);          
    xd =Math.cos(b);   
  }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
}

if(e.getSource()==btan){                  //FOR TANGENT
  try{
    num1=Double.parseDouble(l1.getText());
    double b = Math.toRadians(num1);          
    xd =Math.tan(b);
  }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
}

if(e.getSource()==bcosec){                  //FOR COSECANT
  try{
    num1=Double.parseDouble(l1.getText());
  double b = Math.toRadians(num1);          
  xd =1/(Math.sin(b));
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
}

if(e.getSource()==bsec){                  //FOR SECANT
  try{
    num1=Double.parseDouble(l1.getText());
  double b = Math.toRadians(num1);          
  xd =1/(Math.cos(b));
    
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
}

if(e.getSource()==bcot){                  //FOR COTANGENT

  try{
    num1=Double.parseDouble(l1.getText());
    double b = Math.toRadians(num1);          
    xd =1/(Math.tan(b));
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
}

if(e.getSource()==blog){                  //FOR LOGARITHM FUNCTION
  try{
      num1=Double.parseDouble(l1.getText());
  xd=Math.log10(num1);
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
}

if(e.getSource()==bln){                  //FOR NATURAL LOGARITHM FUNCTION 
  try{
    num1=Double.parseDouble(l1.getText());
    xd=Math.log(num1);
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
}

if(e.getSource()==bex){                  //FOR EXPONENTIAL FUNCTION
  try{
    num1=Double.parseDouble(l1.getText());
  xd=Math.exp(num1);
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
}

if(e.getSource()==bpi){                  //FOR PI FUNCTION
  try{
    num1=Double.parseDouble(l1.getText());
  xd=Math.PI*(num1);
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
}
if(e.getSource()==bin){                  //FOR INVERSE FUNCTION
  try{
    num1=Double.parseDouble(l1.getText());
  xd=1/num1;
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
}
if(e.getSource()==bten){                  //FOR MULTIPLES OF 10 FUNCTION
  try{
    num1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="";
  l1.setText(z);
  check=7;
}
                       
if(e.getSource()==bcalc){           //RESULT BUTTON
  try{
    num2=Double.parseDouble(l1.getText());
if (xd!=0)
l1.setText(String.valueOf(xd));
    }catch(Exception f){
      l1.setText("ENTER NUMBER FIRST ");
      return;
    }
  if(check==1)
    xd =num1+num2;
  if(check==2)
    xd =num1-num2;
  if(check==3)
    xd =num1*num2;
  if(check==4)
    xd =num1/num2;
  if(check==5)
    xd =num1%num2;  
  if(check==6)
    xd =Math.pow(num1,num2);
  if(check==7)
    xd=num1*(Math.pow(10,num2));
 
  l1.setText(String.valueOf(xd));
}
 //FOR CLEARING THE LABEL and Memory
if(e.getSource()==bclr){
  num1=0;
  num2=0;
  check=0;
  xd=0;
   z="";
   l1.setText(z);
   }

}  
//MAIN METHOD where objects of MyCalc is instantaiated
 public static void main(String args[]){  
       new MyCalc();  
   }
}  
