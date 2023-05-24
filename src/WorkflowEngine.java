import java.util.ArrayList;
import java.util.List;

public class WorkflowEngine { // Invoker class for Command Pattern
    private List<WorkflowCommand> commands;

    public WorkflowEngine() {
        this.commands = new ArrayList<>();
    }

    public void AddCommand(WorkflowCommand command) {
        commands.add(command);
    }

    public void ProcessWorkflow() { //invoker because of this method
        for (WorkflowCommand command : commands) {
            command.execute();
        }
    }
}