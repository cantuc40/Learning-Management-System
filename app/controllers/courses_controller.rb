class CoursesController < ApplicationController
    before_action :set_student

    def index
      @courses = Course.all
    end

    def show
    end


    #GET  /students/{:id}/courses/new
    def new
        @course = Course.new
    end

    #POST /students/{:id}/courses/new
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
