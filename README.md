# jlib-extensions

## Quickstart
### Maven
#### dependency
```xml
        <dependency>
            <groupId>com.github.imythu</groupId>
            <artifactId>jlib-extensions</artifactId>
            <version>${version}</version>
        </dependency>
```
#### plugin
```xml
            <!--
            Configure the maven-compiler-plugin use Manifold.
            - add the -Xplugin:Manifold argument for the javac compiler
            - add compile-time manifold modules to javac -processorpath arg
            -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>

                <!-- version 3.8.0+ is necessary to support Java 10+ -->
                <version>3.10.1</version>

                <configuration>
                    <encoding>UTF-8</encoding>
                    <compilerArgs>
                        <!--Add the Manifold plugin-->
                        <arg>-Xplugin:Manifold</arg>
                    </compilerArgs>

                    <!-- Add Manifold compile-time dependencies in the processor path -->
                    <annotationProcessorPaths>
                        <path>
                            <groupId>systems.manifold</groupId>
                            <artifactId>manifold-ext</artifactId>
                            <version>${manifold-version}</version>
                        </path>
                    </annotationProcessorPaths>

                </configuration>
            </plugin>
```
## Extended method
### 1. java.lang.String
#### class: com.github.imythu.jlib.extensions.java.lang.String.StringExt
1. hasText()
4. hasLength()
### 2. java.lang.Object
#### class: com.github.imythu.jlib.extensions.java.lang.String.ObjectExt
1. safeEquals(java.lang.Object). Avoid NPE
