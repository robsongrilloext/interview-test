#!/usr/bin/env groovy
//
@GrabConfig(systemClassLoader = true)
@Grapes([
        @Grab("mysql:mysql-connector-java:6.0.6")
])
//
import groovy.sql.Sql
import groovy.json.JsonBuilder
import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import java.util.concurrent.TimeUnit
import java.text.SimpleDateFormat
import java.time.ZoneId
import java.time.ZonedDateTime
import java.util.concurrent.TimeUnit


try {
    def fileOutput = new File("result.txt")
    fileOutput.delete()
    def fileInput = new File("log.txt")
    def line = ""
    def lineMax = 0
    def lineCount = 0
    fileInput.withReader { reader ->
        while ((line = reader.readLine())!=null) {
            fileOutput.append(line.replace("\t","") + "\n")
        }
    }

}
catch (Exception e) {
    e.printStackTrace()
    println -1
}
println 1
System.exit(0)
//

def getcorrida(line){
    def corrida = new Object()

    corrida.metaClass.posicaoChegada = line.substring(1, 1)
    return corrida

}

def getPosicaoChegada(){

}
