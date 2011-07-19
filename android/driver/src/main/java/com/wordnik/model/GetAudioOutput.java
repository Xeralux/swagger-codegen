package com.wordnik.model;

import com.wordnik.common.WordnikObject;
import com.wordnik.annotations.AllowableValues;
import com.wordnik.annotations.Required;

import com.wordnik.common.WordListType;
import java.util.List;
import java.util.ArrayList;


/**
 * 
 * NOTE: This class is auto generated by the drive code generator program so please do not edit the program manually.  
 * @author ramesh
 *
 */
public class GetAudioOutput extends WordnikObject {

		 //
		 private List<AudioObject> audioObject  = new ArrayList< AudioObject>();  
			 //
		 private List<AudioFile> audioFile  = new ArrayList< AudioFile>();  
		
	
		 //
		 
		 public List<AudioObject> getAudioObject() {
		 	return audioObject;
		 }  
		 
		 public void setAudioObject(List<AudioObject>  audioObject) {
		 	this.audioObject = audioObject;
		 }
			 //
		 
		 public List<AudioFile> getAudioFile() {
		 	return audioFile;
		 }  
		 
		 public void setAudioFile(List<AudioFile>  audioFile) {
		 	this.audioFile = audioFile;
		 }
		
}