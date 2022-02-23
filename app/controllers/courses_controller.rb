class CoursesController < ApplicationController
    before_action :set_student

    #GET /students/:student_id/courses                   student_courses
    def index
      @courses = @student.Course.all
    end

    # GET /students/:student_id/courses/:id              student_course
    def show
    end


    #GET  /students/:student_id/courses/new            new_student_course
    def new
        @course = Course.new
    end

    #POST /students/:student_id/courses
    def create
      @student.courses.create! params.required(:course).permit(
        :name, 
        :number, 
        :name_abbrev, 
        :course_id, 
        :prereqs,
        :description,
        :grade, 
        :professor, 
        :letter_grade, 
        :semester, 
        :year
      )

      respond_to do |format|
        format.html { redirect_to student_url(@student), notice: "Course created." }
      end
    end
  


    #Check if student exists
    private
        def set_student
          @student = Student.find(params[:student_id])
        end
end
