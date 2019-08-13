//
//  ViewController.swift
//  kotlinios
//
//  Created by Yoshiki Miyazawa on 2019/08/02.
//  Copyright © 2019 yochidros. All rights reserved.
//

import UIKit

import common

class ViewController: UIViewController {

    @IBOutlet weak var label: UILabel?
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        label?.text = CommonKt.createApplicationScreenMessage()
            print(CommonKt.currentTimeSeconds())
    }


}

