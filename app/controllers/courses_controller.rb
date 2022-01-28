class CoursesController < ApplicationController
    before_action :set_student




    
    def new
        @course = Course.new
    end


    def create
        @student.courses.create! params.require(:course).permit(:name, :number, :name_abbrev, :course_id, :prereqs,
          :description, :grade, :professor, :letter_grade, :semester, :year)

    end
  



    private
        def set_student
          @student = Student.find(params[:student_id])
        end

end
