class CoursesController < ApplicationController
    before_action :set_student



    #Create new Course for student    
    def new
        @course = Course.new
    end


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
  



    private
        def set_student
          @student = Student.find(params[:student_id])
        end
end
