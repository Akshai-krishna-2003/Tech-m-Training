document.addEventListener("DOMContentLoaded", function() {
    fetch("data.json")
    .then(response => response.json())
    .then(data => {
        let courseList = document.getElementById("courses-list");

        function displayCourses(courses) {
            courseList.innerHTML = "";
            courses.forEach(course => {
                let div = document.createElement("div");
                div.classList.add("course-card");
                div.innerHTML = `
                    <img src="${course.image}" alt="${course.title}">
                    <h3>${course.title}</h3>
                    <p>${course.description}</p>
                    <a href="enrollment.html?course=${encodeURIComponent(course.title)}" class="btn">Enroll Now</a>
                `;
                courseList.appendChild(div);
            });
        }

        // Show all courses initially
        displayCourses(data.courses);

        // Search functionality
        document.getElementById("search").addEventListener("input", function(e) {
            let searchTerm = e.target.value.toLowerCase();
            let filteredCourses = data.courses.filter(course =>
                course.title.toLowerCase().includes(searchTerm)
            );
            displayCourses(filteredCourses);
        });
    });
});




document.addEventListener("DOMContentLoaded", function() {
    fetch("data.json")
    .then(response => response.json())
    .then(data => {
        // Load Instructors
        let instructorList = document.getElementById("instructors-list");
        instructorList.innerHTML = ""; // Clear previous content
        data.instructors.forEach(instructor => {
            let div = document.createElement("div");
            div.classList.add("instructor-card");
            div.innerHTML = `
                <img src="${instructor.image}" alt="${instructor.name}">
                <h3>${instructor.name}</h3>
                <p>${instructor.bio}</p>`;
            instructorList.appendChild(div);
        });
    });
});

document.addEventListener("DOMContentLoaded", function() {
    let slides = document.querySelectorAll(".slide");
    let index = 0;

    document.querySelector(".next").addEventListener("click", () => {
        slides[index].classList.remove("active");
        index = (index + 1) % slides.length;
        slides[index].classList.add("active");
        document.querySelector(".slides").style.transform = `translateX(-${index * 100}%)`;
    });

    document.querySelector(".prev").addEventListener("click", () => {
        slides[index].classList.remove("active");
        index = (index - 1 + slides.length) % slides.length;
        slides[index].classList.add("active");
        document.querySelector(".slides").style.transform = `translateX(-${index * 100}%)`;
    });
});


document.addEventListener("DOMContentLoaded", function() {
    fetch("data.json")
    .then(response => response.json())
    .then(data => {
        const courseSelect = document.getElementById("course-select");

        // Extract the selected course from the URL
        const urlParams = new URLSearchParams(window.location.search);
        const selectedCourse = urlParams.get("course");

        data.courses.forEach(course => {
            let option = document.createElement("option");
            option.value = course.title;
            option.textContent = course.title;
            if (selectedCourse === course.title) {
                option.selected = true; // Automatically select the course
            }
            courseSelect.appendChild(option);
        });
    });

    document.getElementById("enrollment-form").addEventListener("submit", function(e) {
        e.preventDefault();

        let name = document.getElementById("name").value;
        let email = document.getElementById("email").value;
        let phone = document.getElementById("phone").value;
        let course = document.getElementById("course-select").value;

        if (name && email && phone && course) {
            alert(`✅ Successfully Enrolled!\n\n👤 Name: ${name}\n📧 Email: ${email}\n📞 Phone: ${phone}\n📚 Course: ${course}`);
        } else {
            alert("⚠️ Please fill out all fields.");
        }
    });
});
