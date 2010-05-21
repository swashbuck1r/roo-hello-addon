package example.roo.addon;

import org.springframework.roo.shell.CliAvailabilityIndicator;
import org.springframework.roo.shell.CliCommand;
import org.springframework.roo.shell.CommandMarker;
import org.springframework.roo.support.lifecycle.ScopeDevelopmentShell;

@ScopeDevelopmentShell
public class HelloCommands implements CommandMarker
{
    public HelloCommands()
    {

    }

    @CliAvailabilityIndicator("hello setup")
    public boolean isInstallSecurityAvailable()
    {
        return false;
    }

    @CliCommand(value = "hello setup", help = "Install Hello into your project")
    public void installSecurity()
    {
        System.out.println("from hello setup!");
    }
}