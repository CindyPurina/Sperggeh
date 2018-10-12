import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class hiddenCommands extends ListenerAdapter {
	
	public void onMessageReceived(MessageReceivedEvent event) {
		if (event.getAuthor().isBot()) return;
		
		Message message = event.getMessage();
		String content = message.getContentRaw().toLowerCase();
		MessageChannel channel = event.getChannel();
		
		// hidden commands
		// starting with the very basic ones
		if (content.startsWith("no u"))
		{
			channel.sendMessage("no u ").queue();
		}
		
		if (content.startsWith("lol"))
		{
			channel.sendMessage("faggot").queue();
		}
		
		if (content.startsWith("kek"))
		{
			channel.sendMessage("kys irl").queue();
		}
		
		if (content.startsWith("kekkles"))
		{
			channel.sendMessage("Oops, dropped a penny by all y'all Jews.").queue();
			channel.sendMessage("I'm lucky I even got a chance to pick it back up in time.").queue();
		}
		
		// this next set consists of the more tricky ones
		
		// hidden commands' help line
		if (content.startsWith("hidden commands"))
		{
			channel.sendMessage("``no u`` triggers ``no u``").queue();
			channel.sendMessage("``lol`` triggers ``faggot``").queue();
			channel.sendMessage("``kek`` triggers ``kys irl``").queue();
			channel.sendMessage("``kekkles`` triggers ``Oops, dropped my penny, and I'm sure you're a Jew``").queue();
		}
		
	}

}
