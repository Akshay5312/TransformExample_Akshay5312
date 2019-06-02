

def pionter = new Cylinder(	20, // Radius at the bottom
                      		0, // Radius at the top
                      		40, // Height
                      		(int)4 //resolution
                      		).toCSG()//convert to CSG to display      
                      		              			 
def transform = new Transform()
		.rotz( 10) // x,y,z	
		.movex(20)// X , y, z	
 		.roty( 45) // x,y,z
def pionterftmoved =  pionter.transformed(   transform)
// is the same as
def piontermoved =  pionter
		.rotz( 10) // x,y,z	
		.movex(20)// X , y, z	
 		.roty( 45) // x,y,z
		.movez(1)// move it up to see that its even there	
// return the list of parts
return [pionterftmoved,
piontermoved
]