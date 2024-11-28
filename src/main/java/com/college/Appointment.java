package com.college;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/* 
  Колекція, в якій зберігається документ бази даних MongoDB, що представляє інформацію про запис пацієнтів.
*/
@Document(collection = "appointments")
public class Appointment {
    @Id
    private String id;
    private String patientFullName;
    private String doctorFullName;
    private String appointmentDate;
    private String clinic;
    private String department;
    private int patientAge;
    private String patientGender;
    private String patientAddress;
    private String appointmentTime;
    private int doctorAge;
    private String doctorQualificationExperience;
    private String clinicAddress;

    // Конструктор
    public Appointment(String patientFullName, String doctorFullName, String appointmentDate, String clinic, String department,
                       int patientAge, String patientGender, String patientAddress, String appointmentTime,
                       int doctorAge, String doctorQualificationExperience, String clinicAddress) {
        this.patientFullName = patientFullName;
        this.doctorFullName = doctorFullName;
        this.appointmentDate = appointmentDate;
        this.clinic = clinic;
        this.department = department;
        this.patientAge = patientAge;
        this.patientGender = patientGender;
        this.patientAddress = patientAddress;
        this.appointmentTime = appointmentTime;
        this.doctorAge = doctorAge;
        this.doctorQualificationExperience = doctorQualificationExperience;
        this.clinicAddress = clinicAddress;
    }

    // Геттери та сеттери
    public String getId() {
        return id;
    }

    public String getPatientFullName() {
        return patientFullName;
    }

    public void setPatientFullName(String patientFullName) {
        this.patientFullName = patientFullName;
    }

    public String getDoctorFullName() {
        return doctorFullName;
    }

    public void setDoctorFullName(String doctorFullName) {
        this.doctorFullName = doctorFullName;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public int getDoctorAge() {
        return doctorAge;
    }

    public void setDoctorAge(int doctorAge) {
        this.doctorAge = doctorAge;
    }

    public String getDoctorQualificationExperience() {
        return doctorQualificationExperience;
    }

    public void setDoctorQualificationExperience(String doctorQualificationExperience) {
        this.doctorQualificationExperience = doctorQualificationExperience;
    }

    public String getClinicAddress() {
        return clinicAddress;
    }

    public void setClinicAddress(String clinicAddress) {
        this.clinicAddress = clinicAddress;
    }

    // Метод для читабельного представлення об'єкта
    @Override
    public String toString() {
        return "Appointment {" +
                "id='" + id + '\'' +
                ", patientFullName='" + patientFullName + '\'' +
                ", doctorFullName='" + doctorFullName + '\'' +
                ", appointmentDate='" + appointmentDate + '\'' +
                ", clinic='" + clinic + '\'' +
                ", department='" + department + '\'' +
                ", patientAge=" + patientAge +
                ", patientGender='" + patientGender + '\'' +
                ", patientAddress='" + patientAddress + '\'' +
                ", appointmentTime='" + appointmentTime + '\'' +
                ", doctorAge=" + doctorAge +
                ", doctorQualificationExperience='" + doctorQualificationExperience + '\'' +
                ", clinicAddress='" + clinicAddress + '\'' +
                '}';
    }
}
