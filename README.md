
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

## Troubleshoting

 - Compiler arguments with maven
 ```
 
                    <arg>--add-exports</arg>
                    <arg>javafx.base/com.sun.javafx.event=org.controlsfx.controls</arg>
                    <arg>--add-exports</arg>
                    <arg>javafx.graphics/com.sun.javafx.scene=org.controlsfx.controls</arg>

                    <!--
                        <arg>javafx.graphics/com.sun.javafx.scene=org.controlsfx.controls</arg>
                        -->
                    <arg>--add-exports</arg>
                    <arg>javafx.graphics/com.sun.javafx.scene=ALL-UNNAMED</arg>
                    <arg>--add-exports</arg>
                    <arg>javafx.graphics/com.sun.javafx.scene.traversal=ALL-UNNAMED</arg>


                    <arg>--add-exports</arg>
                    <arg>javafx.graphics/com.sun.javafx.css=org.controlsfx.controls</arg>
                    <arg>--add-exports</arg>
                    <arg>javafx.controls/com.sun.javafx.scene.control.behavior=org.controlsfx.controls</arg>
                    <arg>--add-exports</arg><arg>javafx.controls/com.sun.javafx.scene.control=org.controlsfx.controls</arg>
                    <arg>--add-exports</arg> <arg>javafx.controls/com.sun.javafx.scene.control.inputmap=org.controlsfx.controls</arg>
                    <arg>--add-exports</arg>
                    <arg>javafx.base/com.sun.javafx.event=org.controlsfx.controls</arg>
                    <arg>--add-exports</arg>
                    <arg>javafx.base/com.sun.javafx.collections=org.controlsfx.controls</arg>
                    <arg>--add-exports</arg>
                    <arg>javafx.base/com.sun.javafx.runtime=org.controlsfx.controls</arg>
                    <arg>--add-exports</arg>
                    <arg>javafx.web/com.sun.webkit=org.controlsfx.controls</arg>
                    <arg>--add-exports</arg>
                    <arg>javafx.graphics/com.sun.javafx.css=org.controlsfx.controls</arg>
 
 ```
 
 ```
 
                <compilerArgs>
                    <arg>--add-exports</arg>
                    <arg>javafx.graphics/com.sun.javafx.scene=ALL-UNNAMED</arg>
                    <arg>--add-exports</arg>
                    <arg>javafx.graphics/com.sun.javafx.scene.traversal=ALL-UNNAMED</arg>
                    <arg>--add-exports</arg>
                    <arg>javafx.base/com.sun.javafx.event=ALL-UNNAMED</arg>
                </compilerArgs>
                
```                

```
 <compilerArgs> <!-- Added for PreferencesFx dialog can be removed -->
                        <arg>--add-exports</arg>
                        <arg>javafx.graphics/com.sun.javafx.css=ALL-UNNAMED</arg>
                        <arg>--add-exports</arg>
                        <arg>javafx.graphics/com.sun.javafx.css=org.controlsfx.controls</arg>
                        <arg>--add-exports</arg>
                        <arg>javafx.graphics/com.sun.javafx.scene=ALL-UNNAMED</arg>
                        <arg>--add-exports</arg>
                        <arg>javafx.graphics/com.sun.javafx.scene.traversal=ALL-UNNAMED</arg>

                    </compilerArgs>

```
