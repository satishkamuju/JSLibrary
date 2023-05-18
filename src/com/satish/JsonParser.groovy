package com.satish
import groovy.json.JsonSlurperClassic

def parseJson(String response){
	def Slurper = new groovy.json.JsonSlurperClassic()
	def ParsedJson = Slurper.parseText(response)
	return ParsedJson	

}