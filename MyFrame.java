package DigitalClock;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{
	
	Calendar calender;
	SimpleDateFormat timeFormat;
	SimpleDateFormat DayFormat;
	SimpleDateFormat CurrentDateFormat;
	
	JLabel timeLabel;
	JLabel DayLabel;
	JLabel CurrentDateLabel;
	String Time;
	String Day;
	String currentdate;
	
	
	public MyFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("MY CLOCK");
		this.setLayout(new FlowLayout());
		this.setSize(350,200);
		this.setResizable(false);
		timeFormat=new SimpleDateFormat("hh:mm:ss a");
		DayFormat=new SimpleDateFormat("EEEE");
		CurrentDateFormat=new SimpleDateFormat("MMMMM dd,yyyy");
		
		timeLabel=new JLabel();
		timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
		
		timeLabel.setForeground(new Color(0x00FF00));
		timeLabel.setBackground(Color.BLACK);
		timeLabel.setOpaque(true);
		
		 DayLabel = new JLabel();
		DayLabel.setFont(new Font("Ink Free",Font.ITALIC,50));
		
		
		CurrentDateLabel = new JLabel();
		CurrentDateLabel.setFont(new Font("Ink Free",Font.PLAIN,25));
		
		
		this.add(timeLabel);
		this.add(DayLabel);
		this.add(CurrentDateLabel);
		
		this.setVisible(true);
		setTime();
	}
	public void setTime()
	{ while(true)
		{Time=timeFormat.format(calender.getInstance().getTime());
		timeLabel.setText(Time);
		
		Day=DayFormat.format(calender.getInstance().getTime());
		DayLabel.setText(Day);
		
		currentdate=CurrentDateFormat.format(calender.getInstance().getTime());
		
		CurrentDateLabel.setText(currentdate);
		
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();// printstack will help you to identify which method causes the bug.
		}
		}
	}

}
