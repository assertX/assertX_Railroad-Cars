# assertX_Railroad_Cars
In this assignment, you are going to write four related classes (plus the main() program), RailroadCar, TankCar, BoxCar, and RefrigeratorCar.  Using class inheritance and polymorphism, you are going to write a well-organized object-oriented Java program.

•The input file is a plain text file (filename: cars.txt).

•The first data field in each row of the input file is the type of railroad car ("Tank", "Box", or "Refrigerator").

•If the first data field is "Tank", then there are 2 subsequent data fields in the same row, which are the length and radius of the tank car (in that order).

•If the first data field is "Box", then there are 3 subsequent data fields in the same row, which are the length, width, and height of the box car (in that order).

•If the first data field is "Refrigerator", then there are 4 subsequent data fields in the same row, which are the length, width, height, and temperature of the refrigerator car (in that order).

•You cannot assume (or guess) the number of railroad cars in the input file.  In other words, no matter how many railroad cars are stored in the input file, your program should correctly process all of them.

•There are may be empty lines at the beginning, in the middle, and/or at the end of the input file.  Your program should smartly skip those empty lines.


•The output file is a plain text file (filename: volumes.txt).

•After you read in a railroad car (either a tank car, box car, or refrigerator car) from the input file, your program calculates the volume of the railroad car and writes the volume to the output file.

•Each volume is a separate line in the output file.

•For each volume in the output file, please keep exactly 2 decimal places.
