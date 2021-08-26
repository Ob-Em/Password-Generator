package main;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class MyFrame extends Frame implements ActionListener{

	TextField t1;
	TextField t2;
	
	public MyFrame() 
	{	
		this.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc;
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		Button b1 = new Button("generate Password");
		b1.setActionCommand("gen");
		this.add(b1,gbc);
		
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		Button b2 = new Button("copy to clipboard");
		b2.setActionCommand("copy");
		this.add(b2,gbc);
		
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.WEST;
		Label l1 = new Label("Number of Characters:");
		this.add(l1,gbc);
		
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.WEST;
		t1 = new TextField("12");
		this.add(t1,gbc);
		
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.WEST;
		Checkbox c1 = new Checkbox("Numbers included");
		this.add(c1,gbc);
		
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.WEST;
		Checkbox c2 = new Checkbox("Uppercase included");
		this.add(c2,gbc);
		
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.WEST;
		Checkbox c3 = new Checkbox("Signs included");
		this.add(c3,gbc);
		
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.anchor = GridBagConstraints.WEST;
		Label l2 = new Label("Password:");
		this.add(l2,gbc);
		
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.ipadx = 100;
		gbc.anchor = GridBagConstraints.WEST;
		t2 = new TextField("");
		t2.setEditable(false);
		this.add(t2,gbc);
		
		this.setTitle("Password Generator");
		this.setSize(300,250);
		this.setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="gen") 
		{
			
			String retval = "";
			
			int lenght = Integer.parseInt(t1.getText());
			
			for(int i = 0;i < lenght;i++) 
			{
				retval = retval + String.valueOf(genChar(false,false,false));
			}
			
			
			t2.setText(retval);
		}else if(e.getActionCommand()=="copy") 
		{
			
		}
	}
	
	private char genChar(boolean includesigns,boolean includenumbers,boolean includeuppercase) 
	{
		char retval = ' ';
		
		Random my_rand = new Random();
		my_rand.setSeed(System.nanoTime());
		int r_value = my_rand.nextInt();
		int my_mod = 123-97;
		if(includesigns) 
		{
			my_mod = my_mod + 32 - 47;
		}
		
		if(includenumbers) 
		{
			my_mod = my_mod + 48 - 58;
		}
		
		if(includeuppercase) 
		{
			my_mod = my_mod + 41 - 91;
		}
		
		r_value = r_value % my_mod;
		
		retval = (char)(r_value + 97);
		
		return retval;
	}
}
