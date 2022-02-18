class CreateStudents < ActiveRecord::Migration[7.0]
  def change
    create_table :students do |t|
      t.string :name
      t.string :major
      t.numeric :gpa, precision: 10, scale: 4
      t.string :address
      t.date :birthdate

      t.timestamps
    end
  end
end
