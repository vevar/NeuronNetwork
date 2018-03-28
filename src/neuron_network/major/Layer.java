package neuron_network.major;

import neuron_network.Neuron;

import java.util.List;

public abstract class Layer {
    private List<Neuron> listOfNeurons;
    private int numNeuronsLayer;

    public List<Neuron> getListOfNeurons() {
        return listOfNeurons;
    }

    public void setListOfNeurons(List<Neuron> listOfNeurons) {
        this.listOfNeurons = listOfNeurons;
    }

    public int getNumNeuronsLayer() {
        return numNeuronsLayer;
    }

    public void setNumNeuronsLayer(int numNeuronsLayer) {
        this.numNeuronsLayer = numNeuronsLayer;
    }
}
