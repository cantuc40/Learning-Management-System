require "application_system_test_case"

class CoursesTest < ApplicationSystemTestCase
  setup do
    @course = courses(:one)
  end

  test "visiting the index" do
    visit courses_url
    assert_selector "h1", text: "Courses"
  end

  test "should create course" do
    visit courses_url
    click_on "New course"

    fill_in "Course", with: @course.course_id
    fill_in "Description", with: @course.description
    fill_in "Grade", with: @course.grade
    fill_in "Letter grade", with: @course.letter_grade
    fill_in "Name", with: @course.name
    fill_in "Name abbrev", with: @course.name_abbrev
    fill_in "Number", with: @course.number
    fill_in "Prereqs", with: @course.prereqs
    fill_in "Professor", with: @course.professor
    fill_in "Semester", with: @course.semester
    fill_in "Year", with: @course.year
    click_on "Create Course"

    assert_text "Course was successfully created"
    click_on "Back"
  end

  test "should update Course" do
    visit course_url(@course)
    click_on "Edit this course", match: :first

    fill_in "Course", with: @course.course_id
    fill_in "Description", with: @course.description
    fill_in "Grade", with: @course.grade
    fill_in "Letter grade", with: @course.letter_grade
    fill_in "Name", with: @course.name
    fill_in "Name abbrev", with: @course.name_abbrev
    fill_in "Number", with: @course.number
    fill_in "Prereqs", with: @course.prereqs
    fill_in "Professor", with: @course.professor
    fill_in "Semester", with: @course.semester
    fill_in "Year", with: @course.year
    click_on "Update Course"

    assert_text "Course was successfully updated"
    click_on "Back"
  end

  test "should destroy Course" do
    visit course_url(@course)
    click_on "Destroy this course", match: :first

    assert_text "Course was successfully destroyed"
  end
end
