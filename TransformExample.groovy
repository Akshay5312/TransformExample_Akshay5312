//make a list of transforms
def listOfLocations =[
 new Transform()
 		.rot( 90, 0, 40) // x,y,z
		.translate(20,6,30)// X , y, z
  ,
  new Transform()
 		.rot( -90, 0, 0) // x,y,z
		.translate(20,6,30)// X , y, z		
		
]
// make and object we want in many locations
def object = new Cylinder(	20, // Radius at the bottom
                      		0, // Radius at the top
                      		40, // Height
                      		(int)4 //resolution
                      		).toCSG()//convert to CSG to display 
// apply each transform and collect the result in a new list
def movedObjects = listOfLocations.collect{object.transformed(it)}
// return the list of parts
return movedObjects