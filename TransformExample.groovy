//make a list of transforms
def listOfLocations =[]
double size =15
for(int i=0;i<15;i++){
	listOfLocations.add(new Transform()
		.rot( 0, 0, i*(360/size)) // x,y,z	
		.translate(20,0,0)// X , y, z	
 		.rot( 0, -90, 90) // x,y,z	
 		)
}
for(int i=0;i<15;i++){
	listOfLocations.add(new Transform()
		.rot( 0, 0, i*(360/size)) // x,y,z	
		.translate(i*3,0,40)// X , y, z	
 		.rot( 0, -90, 90) // x,y,z	
 		)
}
for(int i=0;i<15;i++){
	listOfLocations.add(new Transform()
		.rot( 0, 0, i*(360/size)) // x,y,z	
		.translate(i*4,0,80+i*5)// X , y, z	
 		.rot( 0, -90, 90) // x,y,z	
 		)
}
// make and object we want in many locations
def object = new Cylinder(	20, // Radius at the bottom
                      		0, // Radius at the top
                      		20, // Height
                      		(int)3 //resolution
                      		).toCSG()//convert to CSG to display 
// apply each transform and collect the result in a new list
def movedObjects = listOfLocations.collect{object.transformed(it)}

// return the list of parts
return movedObjects