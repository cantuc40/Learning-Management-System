require "test_helper"

class CoursesControllerTest < ActionDispatch::IntegrationTest
  # test "the truth" do
  #   assert true
  # end

  test "should get new Course" do
    get new_student_courses_url(@student)
    assert_response :success
  end

  test "should create student course" do
    assert_difference("Student.courses.count") do
      post courses_url, params: { course: {
        name: @student.courses.name, 
        number: @student.courses.number, 
        name_abbrev: @student.courses.name_abbrev, 
        course_id: @student.courses.course_id,
        prereqs: @student.courses.prereqs,
        description: @student.courses.description,
        grade: @student.courses.grade,
        professor: @student.courses.professor, 
        letter_grade: @student.courses.letter_grade, 
        semester: @student.courses.semester,
        year: @student.courses.year
      }}
      end
      
      assert_redirected_to student_url(Student.last)
    end
  
  end
