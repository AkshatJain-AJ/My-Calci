package Cal;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.math.*;
import java.awt.*;
import java.util.*;

class Cals
{
	 JFrame jf;
	 JLabel l1,l2,l3;
	 JTextField t1,t2;
	 JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,bback,b0,bclear,bmul,bdiv,bmodu,badd,bminus,bequ,bdot,boff,bsq,bcube,bntime,bbyx,bfact,bcuberoot,bnroot,bpowerten,blog,bsin,bcos,btan,bln,bsinh,bcosh,btanh;
     Double  A,B;
     int i=0;
     Double Res,z;
     String op;
     int c=0;
	 ArrayList<String>ar=new ArrayList<String>();
     
public void calci()
{
  jf= new JFrame("MY CALCULATOR");
  jf.setBounds(10,10,700,450);
  jf.setLayout(null);
  jf.getContentPane().setBackground(Color.white);
  
  //text field
  t1=new JTextField();
  t1.setBounds(50,50,520,50);
  t1.setHorizontalAlignment(JTextField.RIGHT);
  t1.setFont(new Font("ARIAL", Font.BOLD, 30));
  t1.setBorder(new LineBorder(Color.BLACK));
  jf.add(t1);
    
   //Button equal
   bequ=new JButton("=");
   bequ.setBounds(250,270,45,80);
   bequ.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 17));
   bequ.setBackground(Color.orange);
   jf.add(bequ);
   bequ.addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent e)
	   {
		   if(op=="+"||op=="-"||op=="*"||op=="/"||op=="%"|| op=="x^y"||op=="y-/x")
			   { B=Double.parseDouble(t1.getText());
		   ar.add(t1+"="); }
		   
		   
          if(op=="+")
              Res=A+B; 
          if(op=="-")
        	  Res=A-B;
          if(op=="*")
        	  Res=A*B;
          if(op=="/")
          {
        	  try{
        		  if(B==0.0)
        			  throw new ArithmeticException ();
        		  Res=A/B;
        	  }
        	  catch(Exception e1)
        	  {
        		  t1.setText("Cannot divide by 0");
        	  }
          }
          if(op=="%")
          {
        	  try{
        		  if(B==0.0)
        			  throw new ArithmeticException ();
        		  Res=A%B;
        	  }
        	  catch(Exception e1)
        	  {
        		  t1.setText("Syntax Error");
        	  }
          }
          if(op=="x*x")
        	  Res=Math.pow(A,2);
          if(op=="x*x*x")
        	  Res=Math.pow(A,3);
          if(op=="x^y")
        	  Res=Math.pow(A,B);
          if(op=="x^y")
        	  Res=Math.pow(A,B);
          if(op=="1/x")
        	  Res=Math.pow(A,-1);
          if(op=="n!")
          {
        	    double fact=1;
		      for(int i=1;i<=A;i++)
		      {
		    	  fact=fact*i;
		      }
		      Res=fact;
          }
          if(op=="3-/x")
        	  Res=Math.pow(A,0.3333);
          if(op=="y-/x")
              Res=Math.pow(A,1/B);
          if(op=="10^x")
        	  Res=Math.pow(10,A);
          if(op=="log")
          {
        	  try{
        		  if(A<=0.0)
        			  throw new ArithmeticException ();
        		  Res=(Math.log(A))/2.303;
        	  }
        	  catch(Exception e1)
        	  {
        		  t1.setText("Invalid Input");
        	  }
          } 
          if(op=="sin")
          {
        	   z = Math.toRadians(A);
        	  Res=Math.sin(z);
          }
          if(op=="cos")
          {
        	   z = Math.toRadians(A);
        	  Res=Math.cos(z);
          }
          if(op=="tan")
          {
        	   z = Math.toRadians(A);
        	  Res=Math.tan(z);
          }	
          if(op=="ln")
          {
        	  try{
        		  if(A<=0.0)
        			  throw new ArithmeticException ();
        		  Res=(Math.log(A));
        	  }
        	  catch(Exception e1)
        	  {
        		  t1.setText("Invalid Input");
        	  }
          } 
          if(op=="sinh")
          {
        	   z = Math.toRadians(A);
         	  Res=Math.sinh(z);
          }
          if(op=="cosh")
          {
        	   z = Math.toRadians(A);
         	   Res=Math.cosh(z);
          }
          if(op=="tanh")
          {
        	   z = Math.toRadians(A);
         	   Res=Math.tanh(z);
          }
          
          
             t1.setText(Res.toString());
        	  op ="";
          }
   });
  
   //Button back
    bback=new JButton("<<");
    bback.setBounds(50,120,48,30); 
    bback.setFont(new Font("Cooper Black", Font.PLAIN, 13));
    bback.setBackground(Color.gray);
    jf.add(bback);
    bback.addActionListener(new ActionListener()
    		{
    	      public void actionPerformed(ActionEvent e){ 
    	      String s=t1.getText();
    	      int l=s.length();
    	      s=s.substring(0,l-1);
    	      t1.setText(s);
    		}
    		
    		});
    
    //Button clear  
    bclear=new JButton("C");
    bclear.setBounds(100,120,43,30);
    bclear.setFont(new Font("Cooper Black", Font.PLAIN, 13));
    bclear.setBackground(Color.gray);
    jf.add(bclear);
    bclear.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent e)
    	      {
    	    	  t1.setText(null);
    	    	  A=0.0;
    	    	  B=0.0;
    	    	  Res=0.0;
    	      }
    		});
    
    //Button Off/on
    boff=new JButton("ON/OFF");
    boff.setBounds(250,120,90,30);
    boff.setFont(new Font("Showcard Gothic", Font.PLAIN, 13));
    boff.setBackground(Color.red);
    jf.add(boff);
    boff.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent e)
    	      {
    	    	  i++;
    	    	  if(i%2==1){
    	    	  // boff.setEnabled(false);
    	    	   t1.setText("");
    	    	   b1.setEnabled(false);
    	    	   b2.setEnabled(false);
    	    	   b3.setEnabled(false);
    	    	   b4.setEnabled(false);
    	    	   b5.setEnabled(false);
    	    	   b6.setEnabled(false);
    	    	   b7.setEnabled(false);
    	    	   b8.setEnabled(false);
    	    	   b9.setEnabled(false);
    	    	   bback.setEnabled(false);
    	    	   b0.setEnabled(false);
    	    	   bclear.setEnabled(false);
    	    	   bmul.setEnabled(false);
    	    	   bdiv.setEnabled(false);
    	    	   bmodu.setEnabled(false);
    	    	   badd.setEnabled(false);
    	    	   bminus.setEnabled(false);
    	    	   bequ.setEnabled(false);
    	    	   bdot.setEnabled(false);
    	    	   bsq.setEnabled(false);
    	    	   bcube.setEnabled(false);
    	    	   bntime.setEnabled(false);
    	    	   bbyx.setEnabled(false);
    	    	   bfact.setEnabled(false);
    	    	   bcuberoot.setEnabled(false);
    	    	   bnroot.setEnabled(false);
    	    	   bpowerten.setEnabled(false);
    	    	   blog.setEnabled(false);
    	    	   bsin.setEnabled(false);
    	    	   bcos.setEnabled(false);
    	    	   btan.setEnabled(false);
    	    	   bln.setEnabled(false);
    	    	   bsinh.setEnabled(false);
    	    	   bcosh.setEnabled(false);
    	    	   btanh.setEnabled(false);
    	      }
    	    	  else if(i%2==0){
    	    	   //bon.setEnabled(true);
       	    	   b1.setEnabled(true);
       	    	   b2.setEnabled(true);
       	    	   b3.setEnabled(true);
       	    	   b4.setEnabled(true);
       	    	   b5.setEnabled(true);
       	    	   b6.setEnabled(true);
       	    	   b7.setEnabled(true);
       	    	   b8.setEnabled(true);
       	    	   b9.setEnabled(true);
       	    	   bback.setEnabled(true);
       	    	   b0.setEnabled(true);
       	    	   bclear.setEnabled(true);
       	    	   bmul.setEnabled(true);
       	    	   bdiv.setEnabled(true);
       	    	   bmodu.setEnabled(true);
       	    	   badd.setEnabled(true);
       	    	   bminus.setEnabled(true);
       	    	   bequ.setEnabled(true);
       	    	   bdot.setEnabled(true);
       	    	   bsq.setEnabled(true);
 	    	       bcube.setEnabled(true);
 	    	       bntime.setEnabled(true);
 	    	       bbyx.setEnabled(true);
 	    	       bfact.setEnabled(true);
 	    	       bcuberoot.setEnabled(true);
 	    	       bnroot.setEnabled(true);
 	    	       bpowerten.setEnabled(true);
 	    	       blog.setEnabled(true);
 	    	       bsin.setEnabled(true);
 	    	       bcos.setEnabled(true);
 	    	       btan.setEnabled(true);
 	    	       bln.setEnabled(true);
 	    	       bsinh.setEnabled(true);
 	    	       bcosh.setEnabled(true);
 	    	       btanh.setEnabled(true);
       	    	   t1.setText("");
    	    	  }
    	      }
    });
    
    //Button 1/x
    bbyx=new JButton("1/x");
    bbyx.setBounds(250,220,51,30);
    bbyx.setFont(new Font("Arial Black", Font.PLAIN, 11));
    jf.add(bbyx);
    bbyx.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent e)
    	      {
    	   	    A=Double.parseDouble(t1.getText());
                op="1/x";
               // t1.setText(null);
                c=0;
    	      }
    });
    
    //Button x*x
    bsq=new JButton("x*x");
    bsq.setBounds(350,170,65,30);
    bsq.setFont(new Font("Verdana", Font.BOLD, 13));
    jf.add(bsq);
    bsq.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent e)
    	      {
    	   	    A=Double.parseDouble(t1.getText());
                op="x*x";
               // t1.setText(null);
                c=0;
    	      }
    	    	   
    });
    
    //Button x*x*x
    bcube=new JButton("x*x*x");
    bcube.setBounds(350,220,65,30);
    bcube.setFont(new Font("Verdana", Font.BOLD, 9));
    jf.add(bcube);
    bcube.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent e)
    	      {
    	   	    A=Double.parseDouble(t1.getText());
                op="x*x*x";
               // t1.setText(null);
                c=0;
    	      }
    	    	   
    });
    
    
    //Button x^y
    bntime=new JButton("x^y");
    bntime.setBounds(350,270,65,30);
    bntime.setFont(new Font("Verdana", Font.BOLD, 12));
    jf.add(bntime);
    bntime.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent e)
    	      {
    	   	    A=Double.parseDouble(t1.getText());
                op="x^y";
                t1.setText(null);
                c=0;
    	      }
    	    	   
    }); 
    
    // BUtton log
    blog=new JButton("log");
    blog.setBounds(350,320,65,30);
    blog.setFont(new Font("Verdana", Font.BOLD, 13));
    jf.add(blog);
    blog.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent e)
    	      {
    	   	    A=Double.parseDouble(t1.getText());
                op="log";
                //t1.setText(null);
                c=0;
    	      }
    	    	   
    }); 
    
    
    // BUtton n!
    bfact=new JButton("n!");
    bfact.setBounds(425,170,70,30);
    bfact.setFont(new Font("Verdana", Font.BOLD, 14));
    jf.add(bfact);
    bfact.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent e)
    	      {
    	   	    A=Double.parseDouble(t1.getText());
                op="n!";
                //t1.setText(null);
                c=0;
    	      }
    	    	   
    });
    
    // BUtton 3-/x
    bcuberoot=new JButton("3-/x");
    bcuberoot.setBounds(425,220,70,30);
    bcuberoot.setFont(new Font("Verdana", Font.BOLD, 10));
    jf.add(bcuberoot);
    bcuberoot.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent e)
    	      {
    	   	    A=Double.parseDouble(t1.getText());
                op="3-/x";
                //t1.setText(null);
                c=0;
    	      }
    	    	   
    });
    
    
    // BUtton y-/x
    bnroot=new JButton("y-/x");
    bnroot.setBounds(425,270,70,30);
    bnroot.setFont(new Font("Verdana", Font.BOLD, 10));
    jf.add(bnroot);
    bnroot.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent e)
    	      {
    	   	    A=Double.parseDouble(t1.getText());
                op="y-/x";
                t1.setText(null);
                c=0;
    	      }
    	    	   
    }); 
    
    
    // BUtton 10^x
    bpowerten=new JButton("10^x");
    bpowerten.setBounds(425,320,70,30);
    bpowerten.setFont(new Font("Verdana", Font.BOLD, 10));
    jf.add(bpowerten);
    bpowerten.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent e)
    	      {
    	   	    A=Double.parseDouble(t1.getText());
                op="10^x";
                //t1.setText(null);
                c=0;
    	      }
    	    	   
    }); 
    
    
  
    
    // BUtton sine
    bsin=new JButton("sin");
    bsin.setBounds(505,170,65,30);
    bsin.setFont(new Font("Verdana", Font.BOLD, 13));
    jf.add(bsin);
    bsin.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent e)
    	      {
    	   	    A=Double.parseDouble(t1.getText());
                op="sin";
               // t1.setText(null);
                c=0;
    	      }
    	    	   
    }); 
    
    // Button sinh
    bsinh=new JButton("sinh");
    bsinh.setBounds(585,170,75,30);
    bsinh.setFont(new Font("Verdana", Font.BOLD, 13));
    jf.add(bsinh);
    bsin.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent e)
    	      {
    	   	    A=Double.parseDouble(t1.getText());
                op="sinh";
               // t1.setText(null);
                c=0;
    	      }
    	    	   
    });
    
    // BUtton cosine
    bcos=new JButton("cos");
    bcos.setBounds(505,220,65,30);
    bcos.setFont(new Font("Verdana", Font.BOLD, 13));
    jf.add(bcos);
    bcos.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent e)
    	      {
    	   	    A=Double.parseDouble(t1.getText());
                op="cos";
               // t1.setText(null);
                c=0;
    	      }
    	    	   
    }); 
    
    //Button cosh
    bcosh=new JButton("cosh");
    bcosh.setBounds(585,220,75,30);
    bcosh.setFont(new Font("Verdana", Font.BOLD, 13));
    jf.add(bcosh);
    bcosh.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent e)
    	      {
    	   	    A=Double.parseDouble(t1.getText());
                op="cosh";
               // t1.setText(null);
                c=0;
    	      }
    	    	   
    }); 
    
    
    // BUtton tangent
    btan=new JButton("tan");
    btan.setBounds(505,270,65,30);
    btan.setFont(new Font("Verdana", Font.BOLD, 13));
    jf.add(btan);
    btan.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent e)
    	      {
    	   	    A=Double.parseDouble(t1.getText());
                op="tan";
               // t1.setText(null);
                c=0;
    	      }
    	    	   
    });
    
    //Button tanh
    btanh=new JButton("tanh");
    btanh.setBounds(585,270,75,30);
    btanh.setFont(new Font("Verdana", Font.BOLD, 13));
    jf.add(btanh);
    btanh.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent e)
    	      {
    	   	    A=Double.parseDouble(t1.getText());
                op="tanh";
               // t1.setText(null);
                c=0;
    	      }
    	    	   
    }); 
    
    // BUtton ln
    bln=new JButton("ln");
    bln.setBounds(505,320,65,30);
    bln.setFont(new Font("Verdana", Font.BOLD, 13));
    jf.add(bln);
    bln.addActionListener(new ActionListener(){
    	      public void actionPerformed(ActionEvent e)
    	      {
    	   	    A=Double.parseDouble(t1.getText());
                op="ln";
                //t1.setText(null);
                c=0;
    	      }
    	    	   
    }); 
    
    
    
	//Button multiply
	bmul=new JButton("*");
    bmul.setBounds(200,220,43,30);
    bmul.setFont(new Font("Arial Black", Font.BOLD, 15));
    jf.add(bmul);
    bmul.addActionListener(new ActionListener(){
  	   public void actionPerformed(ActionEvent e)
  	   {
  		   A=Double.parseDouble(t1.getText());
             op="*";
             t1.setText(null);c=0;
  	   }
     });
    
	//Button divide 
    bdiv=new JButton("/");
    bdiv.setBounds(200,170,43,30);
    bdiv.setFont(new Font("Arial Black", Font.PLAIN, 17));
    jf.add(bdiv);
    bdiv.addActionListener(new ActionListener(){
  	   public void actionPerformed(ActionEvent e)
  	   {
  		   A=Double.parseDouble(t1.getText());
             op="/";
             t1.setText(null);c=0;
  	   }
     });
    
	//Button modulus 
	bmodu=new JButton("%");
    bmodu.setBounds(250,170,43,30);
    bmodu.setFont(new Font("Arial Black", Font.PLAIN, 9));
    jf.add(bmodu);
    bmodu.addActionListener(new ActionListener(){
   	   public void actionPerformed(ActionEvent e)
   	   {
   		   A=Double.parseDouble(t1.getText());
              op="%";
              t1.setText(null);c=0;
   	   }
      });
     
    
	//Button add 
    badd=new JButton("+");
    badd.setBounds(200,320,43,30);
    badd.setFont(new Font("Arial Black", Font.PLAIN, 14));
    jf.add(badd);
    badd.addActionListener(new ActionListener(){
 	   public void actionPerformed(ActionEvent e)
 	   {
 		   A=Double.parseDouble(t1.getText());
            op="+";
            t1.setText(null);c=0;
            ar.add(t1+ " + ");
 	   }
    });
    
   //Button minus 
    bminus=new JButton("-");
    bminus.setBounds(200,270,43,30);
    bminus.setFont(new Font("Arial Black", Font.PLAIN, 17));
    jf.add(bminus);
    bminus.addActionListener(new ActionListener(){
  	   public void actionPerformed(ActionEvent e)
  	   {
  		   A=Double.parseDouble(t1.getText());
             op="-";
             t1.setText(null);c=0;
  	   }
     });
    
	//Button dot 
	bdot=new JButton(".");
    bdot.setBounds(150,320,43,30);
    bdot.setFont(new Font("Arial Black", Font.PLAIN, 14));
    jf.add(bdot);
    bdot.addActionListener(new ActionListener ()
    		{
    	       public void actionPerformed(ActionEvent e)
    	       {
    	    	   String a= t1.getText()+bdot.getText();
             	  t1.setText(a);
             	  c++;
             	  if(c>1)
             	  {
             	   String s=t1.getText();
         	      int l=s.length();
         	      s=s.substring(0,l-1);
         	      t1.setText(s);}

    	       }  
    	      
    		} );
    
    
    
	//Button 1 
    b1=new JButton("1");
    b1.setBounds(50,270,43,30);
    b1.setFont(new Font("Britannic Bold", Font.PLAIN, 15));
    b1.setBackground(Color.WHITE);
    jf.add(b1);
    b1.addActionListener(new ActionListener()
    		{
              public void actionPerformed(ActionEvent e)
              {
            	  String a= t1.getText()+b1.getText();
            	  t1.setText(a);
              }
    		}
    		
    		);
    
	//Button 2 
	b2=new JButton("2");
    b2.setBounds(100,270,43,30);
    b2.setFont(new Font("Britannic Bold", Font.PLAIN, 15));
    b2.setBackground(Color.WHITE);
    jf.add(b2);
    b2.addActionListener(new ActionListener()
	{
      public void actionPerformed(ActionEvent e)
      {
    	  String a= t1.getText()+b2.getText();
    	  t1.setText(a);
      }
	}
	
	);
    
	//Button 3 
	b3=new JButton("3");
    b3.setBounds(150,270,43,30);
    b3.setFont(new Font("Britannic Bold", Font.PLAIN, 15));
    b3.setBackground(Color.WHITE);
    jf.add(b3);
    b3.addActionListener(new ActionListener()
	{
      public void actionPerformed(ActionEvent e)
      {
    	  String a= t1.getText()+b3.getText();
    	  t1.setText(a);
      }
	}
	
	);
    
    //Button 4 
	b4=new JButton("4");
	b4.setBounds(50,220,43,30 );
    b4.setFont(new Font("Britannic Bold", Font.PLAIN, 15));
    b4.setBackground(Color.WHITE);
	jf.add(b4);
	 b4.addActionListener(new ActionListener()
		{
       public void actionPerformed(ActionEvent e)
       {
     	  String a= t1.getText()+b4.getText();
     	  t1.setText(a);
       }
		}
		
		);
	
	//Button 5    
	b5=new JButton("5");
	b5.setBounds(100,220,43,30);
    b5.setFont(new Font("Britannic Bold", Font.PLAIN, 15));
    b5.setBackground(Color.WHITE);
	jf.add(b5);
	 b5.addActionListener(new ActionListener()
		{
       public void actionPerformed(ActionEvent e)
       {
     	  String a= t1.getText()+b5.getText();
     	  t1.setText(a);
       }
		}
		
		);
	
	//Button 6	    
	b6=new JButton("6");
	b6.setBounds(150,220,43,30);
	b6.setFont(new Font("Britannic Bold", Font.PLAIN, 15));
	b6.setBackground(Color.WHITE);
	jf.add(b6);
	 b6.addActionListener(new ActionListener()
		{
       public void actionPerformed(ActionEvent e)
       {
     	  String a= t1.getText()+b6.getText();
     	  t1.setText(a);
       }
		}
		
		);
	    
    //Button 7			    
	b7=new JButton("7");
    b7.setBounds(50,170,43,30 );
    b7.setFont(new Font("Britannic Bold", Font.PLAIN, 15));
    b7.setBackground(Color.WHITE);
    jf.add(b7);
    b7.addActionListener(new ActionListener()
	{
      public void actionPerformed(ActionEvent e)
      {
    	  String a= t1.getText()+b7.getText();
    	  t1.setText(a);
      }
	}
	
	);
    
	//Button 8			    
    b8=new JButton("8");
	b8.setBounds(100,170,43,30);
    b8.setFont(new Font("Britannic Bold", Font.PLAIN, 15));
    b8.setBackground(Color.WHITE);
	jf.add(b8);
	 b8.addActionListener(new ActionListener()
		{
       public void actionPerformed(ActionEvent e)
       {
     	  String a= t1.getText()+b8.getText();
     	  t1.setText(a);
       }
		}
		
		);
					    
	//Button 9				    
	b9=new JButton("9");
	b9.setBounds(150,170,43,30);
    b9.setFont(new Font("Britannic Bold", Font.PLAIN, 15));
    b9.setBackground(Color.WHITE);
	jf.add(b9);
	 b9.addActionListener(new ActionListener()
		{
       public void actionPerformed(ActionEvent e)
       {
     	  String a= t1.getText()+b9.getText();
     	  t1.setText(a);
       }
		}
		
		);
	
	//Button 0					    
	b0=new JButton("0");
	b0.setBounds(50,320,90,30);
    b0.setFont(new Font("Britannic Bold", Font.PLAIN, 15));
    b0.setBackground(Color.WHITE);
	jf.add(b0);
	 b0.addActionListener(new ActionListener()
		{
       public void actionPerformed(ActionEvent e)
       {
     	  String a= t1.getText()+b0.getText();
     	  t1.setText(a);
       }
		}
		
		);
	
	  jf.setVisible(true);
	   jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  
}
}
  

public class First
{
 public static void main(String ar[])
 {
	 new Cals().calci();
 }
}
