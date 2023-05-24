import java.util.ArrayList;
import java.util.List;

public class WorkOrder implements DocumentComponent { //Composite class of Composite Pattern, Receiver class of Command Pattern(degil muhtemelen)
    private String name;
    private List<DocumentComponent> documentComponents;

    public WorkOrder(String name) {
        this.name = name;
        this.documentComponents = new ArrayList<>();
    }


    @Override
    public void Add(DocumentComponent d) {
        documentComponents.add(d);
    }

    @Override
    public void Remove(DocumentComponent d) {
        documentComponents.remove(d);
    }

    @Override
    public void Display(int indent) {
        for (int i = 1; i <= indent; i++) System.out.print("-");
        System.out.println("+ " + getName());

        // Display each child element on this node
        for (int i = 0; i < documentComponents.size(); i++) {
            documentComponents.get(i).Display(indent + 2);
        }


    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sign() {
        for (DocumentComponent component : documentComponents) {
            component.sign();
        }
    }

    @Override
    public boolean isSigned() {
        for (DocumentComponent component : documentComponents) {
            if (!component.isSigned()) {
                return false;
            }
        }
        return true;
    }
}
