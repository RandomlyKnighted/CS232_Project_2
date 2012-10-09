import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AsciiViewer extends JPanel
{
	AsciiImage image;
	JTextArea textArea;
	int zoomLevel;
	private JLabel label;
	private JSlider zoomSlider;
	
	public AsciiViewer(AsciiImage image)
	{
		label = new JLabel();
		zoomSlider = new JSlider();
		
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints constraints = new GridBagConstraints();
		
		// Set the constraints for the JLabel
		constraints.gridwidth = GridBagConstraints.RELATIVE;
		gbl.setConstraints(label, constraints);
		add(label);
		
		// Set the constraints for the JSlider
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		gbl.setConstraints(label, constraints);
		add(zoomSlider);
	}
	
	public void setImage(Image image)
	{
	
	}
	
	public void setZoomLevel(int zoomLevel)
	{
	
	}
	
	public static void main(String[] args)
	{
		AsciiViewer viewer = new AsciiViewer();
		JFrame window = new JFrame("Project 2");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(viewer);
		window.pack();
		window.setVisible(true);		
	}
}