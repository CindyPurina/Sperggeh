import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class MyEventListener extends ListenerAdapter {
	
	public void onMessageReceived(MessageReceivedEvent event) {
		if (event.getAuthor().isBot()) return;
		
		Message message = event.getMessage();
		String content = message.getContentRaw().toLowerCase();
		MessageChannel channel = event.getChannel();
		
		// @! commands
		if (content.startsWith("@!."))
		{
			channel.sendMessage("Hello Hooman! "+event.getJDA().getPing()).queue();
		}
		
		if (content.startsWith("@!eevee"))
		{
			channel.sendMessage("https://cdn.discordapp.com/attachments/493819349879095296/498913099882037259/Eevee1.gif").queue();
		}
		
		// Test program to see if I can get the bot to post just the image
		if(content.startsWith("@!bounce"))
		{
			channel.sendMessage("https://cdn.discordapp.com/attachments/500019958332391444/500020038351192074/AssBounce.gif").queue();
		}
		
		// Giving in general prefixes and commands for what the bot has
		
		if(content.startsWith("@!prefix commands"))
		{
			channel.sendMessage("``@!help`` gives all of the ``@!`` commands").queue();
			channel.sendMessage("``hidden commands`` gives all of the commands meant to take newbies offguard").queue();
		}
		
		// help command for all "@!" codes
		
		if (content.startsWith("@!help"))
		{
			channel.sendMessage("All codes starting with @! listed below").queue();
			channel.sendMessage("``@!.`` *translates to* ``Hello Hooman + randomly generated number``").queue();
			channel.sendMessage("``@!eevee`` *translates to* ``A gif of a dancing Eevee``").queue();
			channel.sendMessage("``@!bounce`` *translates to* ``bouncing ass gif``").queue();
			channel.sendMessage("``@!prefix commands`` *translates to* ``providing a list of help functions``").queue();
		}
	}

}
