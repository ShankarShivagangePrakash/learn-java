package java15features.records;

import annotations.customannotation.MyAnnotation;

// we can create records which implements interface.
// we can use annotation in constructor of record constructor.
public record Doctor(@MyAnnotation int id) implements Employee {

    // we can create local records also.

    public int getDoctorExperience() {

        // we can create local record also.
        record DoctorExperience(int experience) {
        }

        // creating object of local record.
        return new DoctorExperience(10).experience;
    }
}
