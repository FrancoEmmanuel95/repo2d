package Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import Model.Airport;
import Model.insufficientCapacityException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirportService {
    List<Airport> airports = new ArrayList<Airport>();
    ObjectMapper mapper = new ObjectMapper();

    public List openFile(String fileName) {
        try {
            airports = mapper.readValue(fileName, new TypeReference<List<Airport>>() {
            });
        } catch (IOException e) {
            System.out.println("el archivo no existe");
        }
        return airports;
    }

    public List capacityFilter(Integer filter, ArrayList<Airport> Origin) {
        List<Airport> filteredList = new ArrayList<>();

        for (Airport airport : Origin) {
            try {
                if (filter > airport.getCapacidad()) {
                    filteredList.add(airport);
                } else {
                    throw new insufficientCapacityException(airport.getCapacidad());
                }
            } catch (insufficientCapacityException e) {
                System.out.println("Capacidad del aeropuerto insuficiente (" + airport.getCapacidad() + ")");
            }
        }


        return filteredList;
    }

}
