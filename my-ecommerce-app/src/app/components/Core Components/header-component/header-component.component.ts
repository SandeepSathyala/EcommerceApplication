import { Component } from '@angular/core';
import { SignupComponent } from '../../Authentication Components/signup/signup.component';

@Component({
  selector: 'app-header-component',
  standalone: true,
  imports: [SignupComponent],
  templateUrl: './header-component.component.html',
  styleUrl: './header-component.component.css'
})
export class HeaderComponentComponent {

}
