package todo;


public class ActionProvider {
    public Action createAction(TaskModel model, Command command) {
        if(command.getName().equals("show")) {
            return new ShowTaskAction(model, command);
        } else {
            return null;
        }
    }
}