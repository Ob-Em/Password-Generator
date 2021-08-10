package main;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame implements ActionListener{

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
		TextField t1 = new TextField("12");
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
		TextField t2 = new TextField("");
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
			//t1.setText("SampleText");
		}else if(e.getActionCommand()=="copy") 
		{
			
		}
	}
}
