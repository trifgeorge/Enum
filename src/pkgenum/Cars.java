/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgenum;

/**
 *
 * @author G
 */
public enum Cars {

BIGCARS("BigCars"), SMALLCARS("SmallCars"), MEDIUMCARS("MediumCars");

private String nameAsString;

private Cars(String nameAsString){
    this.nameAsString=nameAsString;
}

    @Override
    public String toString() {
        return this.nameAsString;
    }


}