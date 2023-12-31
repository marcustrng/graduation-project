INSERT INTO public.career_level (career_level_id, career_level_name)
VALUES (1,'DOCTOR'),
       (2,'MASTER'),
       (3,'BACHELOR'),
       (4,'ASSOCIATE'),
       (5,'INTERMEDIATE');

INSERT INTO public.faculties (faculty_name)
VALUES ('ACCOUNTING'),
       ('INFORMATION TECHNOLOGY'),
       ('ELECTRICAL ENGINEERING'),
       ('MECHANICS'),
       ('TRANSPORTATION ENGINEERING'),
       ('TELECOMMUNICATION');

INSERT INTO public.courses (faculty_id, course_name, course_code, credits)
VALUES (2, 'Data Structures and Algorithms', 'IT301', 4),
       (2, 'Software Engineering', 'IT401', 4),
       (2, 'Artificial Intelligence', 'IT501', 3),
       (2, 'Computer Networks', 'IT201', 3),
       (2, 'Operating Systems', 'IT301', 4),
       (2, 'Cybersecurity', 'IT401', 3),
       (2, 'Cloud Computing', 'IT501', 4),
       (2, 'Machine Learning', 'IT401', 4),
       (2, 'Data Analytics', 'IT501', 3),
       (2, 'Human-Computer Interaction', 'IT601', 3),
       (2, 'Mobile App Development', 'IT701', 4),
       (2, 'Computer Graphics', 'IT401', 3),
       (2, 'Software Testing and Quality Assurance', 'IT501', 4),
       (2, 'Data Mining', 'IT601', 3),
       (2, 'Internet of Things', 'IT701', 4),
       (2, 'Computer Architecture', 'IT301', 4),
       (2, 'Ethical Hacking', 'IT401', 3),
       (2, 'Distributed Systems', 'IT501', 4),
       (2, 'Natural Language Processing', 'IT601', 3),
       (2, 'Data Visualization', 'IT301', 3),
       (2, 'Information Security', 'IT401', 4),
       (2, 'Big Data Analytics', 'IT501', 4),
       (2, 'Computer Vision', 'IT601', 3),
       (2, 'Agile Software Development', 'IT701', 4),
       (2, 'Introduction to Cybersecurity', 'IT101', 3),
       (2, 'Web Application Development', 'IT201', 4),
       (2, 'Data Science Fundamentals', 'IT301', 4),
       (2, 'Cloud Infrastructure Management', 'IT401', 3),
       (2, 'Software Project Management', 'IT301', 3),
       (2, 'Computer Ethics and Privacy', 'IT401', 4),
       (2, 'Blockchain Technology', 'IT501', 3),
       (2, 'Digital Marketing', 'IT601', 4),
       (2, 'Mobile Application Security', 'IT401', 4),
       (2, 'Computer Forensics', 'IT501', 3),
       (2, 'Data Warehousing', 'IT601', 4),
       (2, 'Network Administration', 'IT701', 3),
       (2, 'Artificial Neural Networks', 'IT801', 4);

INSERT INTO public.professors (first_name, last_name, date_of_birth, gender, phone_number, email)
VALUES
    ('John', 'Doe', '1980-05-15', 'Male', '1234567890', 'johndoe@example.com'),
    ('Jane', 'Smith', '1975-09-20', 'Female', '9876543210', 'janesmith@example.com'),
    ('Michael', 'Johnson', '1982-12-10', 'Male', '5555555555', 'michaeljohnson@example.com'),
    ('Robert', 'Johnson', '1978-08-10', 'Male', '5554443333', 'robertjohnson@example.com'),
    ('Emily', 'Davis', '1985-03-25', 'Female', '1231231234', 'emilydavis@example.com'),
    ('David', 'Anderson', '1983-11-02', 'Male', '9878765432', 'davidanderson@example.com'),
    ('Sarah', 'Wilson', '1976-06-18', 'Female', '9998887777', 'sarahwilson@example.com'),
    ('Matthew', 'Taylor', '1981-09-05', 'Male', '7777777777', 'matthewtaylor@example.com'),
    ('Jennifer', 'Brown', '1984-12-30', 'Female', '5556667777', 'jenniferbrown@example.com'),
    ('Daniel', 'Martinez', '1979-04-12', 'Male', '2222222222', 'danielmartinez@example.com'),
    ('Olivia', 'Thomas', '1986-07-08', 'Female', '4445556666', 'oliviathomas@example.com'),
    ('William', 'Miller', '1980-10-22', 'Male', '1112223333', 'williammiller@example.com');

INSERT INTO public.professor_course (professor_id, course_id)
VALUES
    (1, 1),
    (1, 2),
    (2, 3),
    (2, 4),
    (3, 5),
    (3, 6),
    (4, 7),
    (4, 8),
    (5, 9),
    (5, 10),
    (6, 11),
    (6, 12),
    (7, 13),
    (7, 14),
    (8, 15),
    (8, 16),
    (9, 17),
    (9, 18),
    (10, 19),
    (10, 20),
    (11, 21),
    (11, 22),
    (12, 23),
    (12, 24),
    (1, 25),
    (1, 26),
    (2, 27),
    (2, 28),
    (3, 29),
    (3, 30),
    (4, 31),
    (4, 32),
    (5, 33),
    (5, 34),
    (6, 35),
    (6, 36),
    (7, 37);