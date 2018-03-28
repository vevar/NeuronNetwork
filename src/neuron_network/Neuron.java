package neuron_network;

import java.util.ArrayList;
import java.util.List;

public class Neuron {
    private List<Double> listOfWeightIn;
    private List<Double> listOfWeightOut;

    public double initNeuron() {
        double random = Math.random();

        listOfWeightIn = new ArrayList<>();
        listOfWeightIn.add(random);

        listOfWeightOut = new ArrayList<>();
        listOfWeightOut.add(random);

        return random;
    }

    public List<Double> getListOfWeightIn() {
        return listOfWeightIn;
    }

    public void setListOfWeightIn(List<Double> listOfWeightIn) {
        this.listOfWeightIn = listOfWeightIn;
    }

    public List<Double> getListOfWeightOut() {
        return listOfWeightOut;
    }

    public void setListOfWeightOut(List<Double> listOfWeightOut) {
        this.listOfWeightOut = listOfWeightOut;
    }

    public void printWeightIn() {
        System.out.println("Weights IN: ");
        for (double weight : listOfWeightIn) {
            System.out.println(weight + "; ");
        }
    }

    public void printWeightOut() {
        System.out.println("Weights OUT: ");
        for (double weight : listOfWeightOut) {
            System.out.println(weight + "; ");
        }
    }
}
