package yamlparse

import groovy.yaml.YamlSlurper

class App {

    static void main(String[] args) {
        def slurper = new YamlSlurper()
        def yaml = slurper.parse(App.getResourceAsStream('/demo.yml'))

        Map m = yaml.info
        println m
        assert m.TestValueX == 0
        assert m.TestValueY == 1
        assert m.TestValueZ == 4
    }
}
