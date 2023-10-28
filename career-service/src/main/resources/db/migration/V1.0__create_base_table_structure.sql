create table public.university_classes
(
    university_class_id   serial
        constraint university_classes_pk
            primary key,
    career_id  integer not null,
    class_name varchar(100)
);

create table public.students
(
    student_id         serial
        constraint students_pk
            primary key,
    class_id           integer
        constraint students_university_classes_fk
            references public.university_classes,
    first_name         varchar(100),
    last_name          varchar(100),
    date_of_birth      date,
    gender             varchar(10),
    phone_number       varchar(15),
    email              varchar(50),
    career_status_name varchar(50),
    career_status_date date
);

create table public.course_enrollment
(
    course_enrollment_id serial
        constraint course_enrollment_pk
            primary key,
    student_id           integer not null
        constraint course_enrollment_students_student_id_fk
            references public.students,
    course_occurrence_id integer not null,
    attendance_score     double precision,
    progress_score       double precision,
    midterm_exam_score   double precision,
    final_exam_score     double precision,
    final_score          double precision
);


