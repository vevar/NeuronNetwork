package neuron_network;

import neuron_network.major.Layer;

import java.util.ArrayList;
import java.util.List;

public class InputLayer extends Layer {

    public InputLayer initLayer(InputLayer inputLayer) {
        int numNeurons = inputLayer.getNumNeuronsLayer();
        Neuron neuron;
        List<Neuron> neuronList = new ArrayList<>();

        for (int i = 0; i < numNeurons; i++) {
            neuron = new Neuron();
            neuron.initNeuron();
            neuronList.add(neuron);
        }

        inputLayer.setListOfNeurons(neuronList);

        return inputLayer;
    }

    public void printLayer(InputLayer layer) {
        System.out.println("#### INPUT LAYER ####");
        int amountNeurons = layer.getNumNeuronsLayer();
        List<Neuron> listOfNeurons = layer.getListOfNeurons();

        for (int i = 1; i < amountNeurons; i++){
            System.out.println("Neuron #" + i);
            System.out.print("[");
            listOfNeurons.get(i).printWeightIn();
            System.out.print("]");
        }
    }

}
