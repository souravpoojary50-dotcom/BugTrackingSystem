import java.util.*;

public class BugService {
    private List<Bug> bugs;

    public BugService() {
        try {
            bugs = FileHandler.loadBugs();
        } catch (Exception e) {
            bugs = new ArrayList<>();
        }
    }

    public void addBug(String title, String priority, String assignedTo) {
        int id = bugs.size() + 1;
        bugs.add(new Bug(id, title, priority, assignedTo));
        save();
    }

    public void viewBugs() {
        for (Bug b : bugs) {
            b.display();
        }
    }

    public void updateStatus(int id, String status) {
        for (Bug b : bugs) {
            if (b.getId() == id) {
                b.setStatus(status);
                save();
                return;
            }
        }
        System.out.println("Bug not found!");
    }

    private void save() {
        try {
            FileHandler.saveBugs(bugs);
        } catch (Exception e) {
            System.out.println("Error saving data");
        }
    }
}