import java.util.ArrayList;
import java.util.Scanner;

public class resumeGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for their personal information
        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Enter your date of birth (MM/DD/YYYY):");
        String dob = input.nextLine();
        System.out.println("Enter your email address:");
        String email = input.nextLine();
        System.out.println("Enter your phone number:");
        String phone = input.nextLine();

        // Prompt the user for their work experience
        System.out.println(
                "Enter your work experience (separate each experience with a new line, and include job title, company, dates, and description):");
        ArrayList<String> workExperience = new ArrayList<>();
        String experience = input.nextLine();
        while (!experience.equals("")) {
            workExperience.add(experience);
            experience = input.nextLine();
        }

        // Prompt the user for their education
        System.out.println(
                "Enter your education (separate each degree with a new line, and include degree name, institution, dates, and GPA):");
        ArrayList<String> education = new ArrayList<>();
        String degree = input.nextLine();
        while (!degree.equals("")) {
            education.add(degree);
            degree = input.nextLine();
        }

        // Prompt the user for their skills
        System.out.println("Enter your skills (separate each skill with a comma):");
        String skills = input.nextLine();

        // Generate the formatted resume
        String resume = generateResume(name, dob, email, phone, workExperience, education, skills);
        System.out.println(resume);
    }

    // Generate the formatted resume
    public static String generateResume(String name, String dob, String email, String phone,
            ArrayList<String> workExperience, ArrayList<String> education, String skills) {
        String resume = "==================================\n";
        resume += "              RESUME\n";
        resume += "==================================\n\n";
        resume += "Name: " + name + "\n";
        resume += "Date of Birth: " + dob + "\n";
        resume += "Email: " + email + "\n";
        resume += "Phone: " + phone + "\n\n";
        resume += "Work Experience:\n";
        for (String experience : workExperience) {
            resume += "- " + experience + "\n";
        }
        resume += "\nEducation:\n";
        for (String degree : education) {
            resume += "- " + degree + "\n";
        }
        resume += "\nSkills: " + skills + "\n";
        return resume;
    }
}
