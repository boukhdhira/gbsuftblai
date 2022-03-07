import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-gbsu-ftb-lai-form',
  templateUrl: './gbsu-ftb-lai-form.component.html'
})
export class GbsuFtbLaiFormComponent implements OnInit {

  formGroup: FormGroup;

  @Output() submitNumberOutput: EventEmitter<string> = new EventEmitter<string>();


  constructor(private fb: FormBuilder) {
  }

  ngOnInit(): void {
    this.formGroup = this.fb.group({
      inputNumber: new FormControl('', Validators.required)
    });
  }

  submitNumber(): void {
    console.log('Attempts to convert ', this.formGroup.value);
    if (this.formGroup.valid) {
      this.submitNumberOutput.emit(this.formGroup.value.inputNumber);
    }
  }

}
