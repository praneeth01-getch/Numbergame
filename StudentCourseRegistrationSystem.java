public class StudentCourseRegistrationSystem {

    public static void main(String[] args) {
        
        // Creating a scanner object for taking input
        Scanner sc = new Scanner(System.in);

        // Student information input
        System.out.print("Enter your school name: ");
        String schoolName = sc.nextLine();

        System.out.print("Enter your session: ");
        int session = sc.nextInt();

        System.out.print("Enter your roll no: ");
        int rollNo = sc.nextInt();
        sc.nextLine(); // To consume the newline character

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your father's name: ");
        String fatherName = sc.nextLine();

        System.out.print("Enter your mother's name: ");
        String motherName = sc.nextLine();

        System.out.print("Enter your class: ");
        int standard = sc.nextInt();
        sc.nextLine(); // To consume the newline character

        // List of available courses
        List<String> availableCourses = new ArrayList<>();
        availableCourses.add("Physics");
        availableCourses.add("Chemistry");
        availableCourses.add("Mathematics");
        availableCourses.add("English");
        availableCourses.add("Hindi");

        // List to store registered courses
        List<String> registeredCourses = new ArrayList<>();

        // Course Registration System
        boolean registering = true;

        while (registering) {
            System.out.println("\n----- Course Registration Menu -----");
            System.out.println("1. View Available Courses");
            System.out.println("2. Register for a Course");
            System.out.println("3. View Registered Courses");
            System.out.println("4. Unregister a Course");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // To consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Courses: ");
                    for (int i = 0; i < availableCourses.size(); i++) {
                        System.out.println((i + 1) + ". " + availableCourses.get(i));
                    }
                    break;
                
                case 2:
                    System.out.println("\nEnter the course number you want to register for:");
                    for (int i = 0; i < availableCourses.size(); i++) {
                        System.out.println((i + 1) + ". " + availableCourses.get(i));
                    }

                    int courseChoice = sc.nextInt();
                    sc.nextLine(); // To consume the newline character
                    
                    // Validate the course selection
                    if (courseChoice >= 1 && courseChoice <= availableCourses.size()) {
                        String selectedCourse = availableCourses.get(courseChoice - 1);

                        if (registeredCourses.contains(selectedCourse)) {
                            System.out.println("You are already registered for this course.");
                        } else {
                            registeredCourses.add(selectedCourse);
                            System.out.println("Successfully registered for " + selectedCourse + ".");
                        }
                    } else {
                        System.out.println("Invalid course number.");
                    }
                    break;
                
                case 3:
                    System.out.println("\nYour Registered Courses: ");
                    if (registeredCourses.isEmpty()) {
                        System.out.println("No courses registered yet.");
                    } else {
                        for (String course : registeredCourses) {
                            System.out.println(course);
                        }
                    }
                    break;
                
                case 4:
                    System.out.println("\nEnter the course number you want to unregister from:");
                    for (int i = 0; i < registeredCourses.size(); i++) {
                        System.out.println((i + 1) + ". " + registeredCourses.get(i));
                    }

                    int unregisterChoice = sc.nextInt();
                    sc.nextLine(); // To consume the newline character
                    
                    // Validate the course unregistration
                    if (unregisterChoice >= 1 && unregisterChoice <= registeredCourses.size()) {
                        String courseToUnregister = registeredCourses.get(unregisterChoice - 1);
                        registeredCourses.remove(courseToUnregister);
                        System.out.println("Successfully unregistered from " + courseToUnregister + ".");
                    } else {
                        System.out.println("Invalid course number.");
                    }
                    break;
                
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    registering = false;
                    break;
                
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        // Closing the scanner object to avoid resource leak
        sc.close();
    } // Closing brace for the main method

}  // Closing brace for the class
