import kilim.Pausable;
import kilim.Task;

public class MyVirus extends Task {
    public void execute() throws Pausable {
        //Código do vírus
    }
}

// Cria uma nova instância do vírus
MyVirus virus = new MyVirus();

// Inicia o vírus
virus.start();

// Espera até que o vírus termine
virus.join();
