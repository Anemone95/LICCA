package top.anemone.mainFrame.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButtonMenuItem;

import top.anemone.pubSub.Message;
import top.anemone.pubSub.MessageBroker;
import top.anemone.pubSub.Publisher;
import top.anemone.datastructures.result.Result;

public class ResultMenuItem extends JRadioButtonMenuItem implements Publisher {

	private static final long serialVersionUID = -8633293596036123827L;

	private Result result;

	public ResultMenuItem(Result result) {
		super(result.getTitle());
		this.result = result;
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MessageBroker.instance().send(
						new Message(Result.class, ResultMenuItem.this.result,
								ResultMenuItem.this));
			}
		});
	}
}
