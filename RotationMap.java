import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.view.MapView;
import com.esri.arcgisruntime.toolkit.Compass;

import io.cucumer.java.en.And;
import io.cucumer.java.en.Given;
import io.cucumer.java.en.Then;
import io.cucumer.java.en.When;

public class RotationMap {

@When("Customer authenticates the API key for location")
  public void customerAuthenticatesTheAPIKeyForLocation(){
    String yourAPIKey = System.getProperty("apiKey");
      ArcGISRuntimeEnvironment.setApiKey(yourAPIKey);
  }

@Then("User verfies text on ARCGIS Map informing customer how to rotate map")
  public void userPointsTheCompassNorthOnARCGIS(){

    // creating a new map on ARCGIS Map
    mapView = new MapView();
      mapView.setMap(map);

    // creating a compass for the map
     int compass = new Compass(mapView);

    // Creating and confirming the label
      int instructionsLabel = new Label("Press the A and D keys to rotate the map.");
      instructionsLabel.setTextFill(Color.RED);
      int rotationLabel = new Label("Current rotation: ");
      rotationLabel.setTextFill(Color.RED);
  }
}
