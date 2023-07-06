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
    String customerApiKey = System.getProperty("apiKey");
      ArcGISRuntimeEnvironment.setApiKey(customerApiKey);
  }

@Then("User verfies text on ARCGIS Map informing customer how to rotate map")
  public void userVerifiesTextOnARCGISMapInformingCustomerHowToRotateMap(){

    // creating a new map on ARCGIS Map
    arcgisMap = new arcgisMap();
      arcgisMap.setMap(map);

    // creating a compass for the map
     int compass = new Compass(viewMap);

    // Creating and confirming the text on the Map
      int textLabel = new Label("Press the A and D keys to rotate the map.");
      textLabel.setTextFill(Color.RED);
      int rotationinformation = new Label("Current rotation: ");
      rotationinformation.setTextFill(Color.RED);
  }
}
