
# JavaFx
## Runtimes
 - JavaFx platform
 - Gluon mobile application framework

## UI layouts
 + StackPane
 + AnchorPane
   - As the name implies it anchors the child nodes to the pane
   - It lets us to position nodes relative to the pane edges   
 + GridPane
 + FlowPane and TilePane
 + BorderPane
 + SplitPane
 + HBox, VBox, and ButtonBar
 
## UI components
 + ScrollPane
   - Use fitToHeight and fitToWidth property to fit the components inside ScrollPane to the varying size of ScrollPane panel
 
## Tools
 - Scene builder
 - Intellij Idea IDE with JavaFx activated

## Libraries
 + [FontawesomeFX](https://bitbucket.org/Jerady/fontawesomefx/src/master/)
   - ``` 
     <!-- https://mvnrepository.com/artifact/de.jensd/fontawesomefx -->  
      <dependency>  
        <groupId>de.jensd</groupId>  
        <artifactId>fontawesomefx</artifactId>  
        <version>8.9</version>  
      </dependency> 
     
     ```
  + [Jfoenix](http://www.jfoenix.com/)
    - ```
        <dependency>
           <groupId>com.jfoenix</groupId>
           <artifactId>jfoenix</artifactId>
           <version>9.0.10</version>
        </dependency>
      ```  

  + [PreferencesFx](https://github.com/dlsc-software-consulting-gmbh/PreferencesFX)
    - Creating preference dialogs in JavaFX is a tedious and very error-prone task. PreferencesFX is a framework which solves this problem. 
      It enables the developer to create preference dialogs with ease and creates well-designed and
      user-friendly preference dialogs by default.
    - ```
        <dependency>
         <groupId>com.dlsc.preferencesfx</groupId>
         <artifactId>preferencesfx-core</artifactId>
         <version>11.7.0</version>
        </dependency>

      ```
   + [BoostrapFx](https://github.com/kordamp/bootstrapfx) 
     - ```
        <dependency>
         <groupId>org.kordamp.bootstrapfx</groupId>
         <artifactId>bootstrapfx-core</artifactId>
         <version>0.4.0</version>
        </dependency>
       ```
   + [Jbootx](https://github.com/dicolar/jbootx)
     - a javafx theme of bootstrap
     
   + [CustomStage](https://github.com/Oshan96/CustomStage)
     - A JavaFX undecorated stage which can fully be customized
     - ```
        <dependency>
         <groupId>lk.vivoxalabs.customstage</groupId>
         <artifactId>CustomStage</artifactId>
         <version>1.3.2</version>
        </dependency>
        ```
   + [DesktopPaneFX](https://github.com/kordamp/desktoppanefx)
      - DesktopPaneFX is a JavaFX version of Swing’s JDesktopPane which can be used as a container for individual "child" similar to JInternalFrames.
      - ```
         <dependencies>
          <dependency>
           <groupId>org.kordamp.desktoppanefx</groupId>
           <artifactId>desktoppanefx-core</artifactId>
           <version>0.15.0</version>
          </dependency>
         </dependencies>
    
        ```
   + [ResponsiveFx](https://github.com/canoo/ResponsiveFX)
      - ```
         <groupId>com.guigarage</groupId>
          <artifactId>responsivefx</artifactId>
         <version>0.8</version>
        ``` 
   + [Tilesfx](https://github.com/HanSolo/tilesfx)     
      - A JavaFX library containing tiles for Dashboards.
   + [JSilhouette](https://kordamp.org/jsilhouette/)
      - JSilhouette provides additional shapes for Java applications. Currently JavaFX is supported.
   + [Medusa](https://github.com/HanSolo/Medusa)
      - A JavaFX library for Gauges. The main focus of this project is to provide Gauges that can be configured in multiple ways.
   + [MigLayout - Java Layout Manager](https://miglayout.com/)
   + [Charts](https://github.com/HanSolo/charts)
   + [FXRibbon](https://github.com/dukke/FXRibbon)
   + [GSI-CS-CO/chart-fx](https://github.com/GSI-CS-CO/chart-fx)
     - A scientific charting library focused on performance optimised real-time data visualisation at 25 Hz update rates for datasets
       with a few 10 thousand up to 5 million data points. 
   + [Orson Charts](http://www.object-refinery.com/orsoncharts/)

## Troubleshoting

 + Sqlite
   - https://stackoverflow.com/questions/2228462/are-there-any-good-cachedrowset-implementations-other-than-the-proprietary-sun-o

 + RxTxLibrary
   - If using this library for serial communication ensure the following
     * rxtxSerial.dll or rxtxSerial.so is in <JAVA_HOME>\jre\bin
     * rxtxParallel.dll or rxtxParallel.so is in <JAVA_HOME>\jre\bin


## Sample Projects
 + [NotesFX](https://github.com/emlautarom1/NotesFX)
 + [Javafx samples](https://easyknowledge24.blogspot.com/p/javafx.html)

## Tutorials
 + https://riptutorial.com/javafx/example/28033/creating-custom-dialog 
 + https://www.oracle.com/webfolder/technetwork/tutorials/obe/java/BinaryWebSocket/binaryWebSocket.html
 + https://www.swtestacademy.com/database-operations-javafx/
 + https://edencoding.com/connect-javafx-with-sqlite/
 + [How to Design a Vertical Side Menu With Tabs - JavaFX IntelUI Inspiration](https://www.youtube.com/watch?app=desktop&v=ZVtys3GgkMo)
 + [Load Data on TableView from MySQL Database](https://www.codegrepper.com/code-examples/java/Load+Data+on+TableView+from+MySQL+Database)
 + [Java connection pooling](https://www.baeldung.com/java-connection-pooling)
 + [Getting started with Javafx on Raspberry Pi](https://blogs.oracle.com/javamagazine/post/getting-started-with-javafx-on-raspberry-pi)

### Setting up environment
 + [Install java in debian 9](https://linuxize.com/post/install-java-on-debian-9/)
 + Select from alternative Java versions
   ``` 
     sudo update-alternatives --config java   
   ```
 + Installing a Debian package
   ```
   sudo dpkg -i /absolute/path/to/deb/file
   sudo apt-get install -f
   ``` 
 + GUI version of alternatives
   ```
   sudo apt-get install galternatives
   ```
 + [Download bellsoft-jdk13-linux-arm32-vfp-hflt.deb](https://download.bell-sw.com/java/13/bellsoft-jdk13-linux-arm32-vfp-hflt.deb)
 + [Download embedded JDK or JRE here](https://bell-sw.com/pages/downloads-embedded/?version=java-13&os=Linux-Ubuntu-Debian&bitness=32-bit&architecture=ARM&package=jre)

### Installing RxTx in boards

 + [Installation methods](http://rxtx.qbang.org/wiki/index.php/Installation_on_Linux)
 + If Debian 
   - ``` sudo apt-get install librxtx-java ```
   - If librxtxSerial.so is not found by Java application then
     * ``` sudo cp /usr/lib/jni/librxtxSerial.so $JAVA_HOME/jre/lib/ ```
     * ``` sudo cp /usr/lib/jni/librxtxSerial.so $JAVA_HOME/jdk/lib/ ```




