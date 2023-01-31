今天有个一直在报java bean生成的错位，究其根源，maven中缺少一个包，特此记录。  
缺这个包  
```
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-aop</artifactId>
            <version>${spring.version}</version>
        </dependency>
```