interface Course {
    title: string;
    description: string;
}

fetch("data.json")
    .then(response => response.json())
    .then(data => {
        const courseSelect = document.getElementById("course-select") as HTMLSelectElement;
        data.courses.forEach((course: Course) => {
            let option = document.createElement("option");
            option.text = course.title;
            courseSelect.add(option);
        });
    });

document.getElementById("enrollment-form")?.addEventListener("submit", function(event) {
    event.preventDefault();
    alert("Enrollment confirmed!");
});
