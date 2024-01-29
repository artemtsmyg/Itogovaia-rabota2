import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Базовый класс животного
abstract class Animal {
    private String name;
    private List<String> commands = new ArrayList<>();

    public Animal(String name) {
        this.name = name;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public String getName() {
        return name;
    }

    public List<String> getCommands() {
        return commands;
    }
}